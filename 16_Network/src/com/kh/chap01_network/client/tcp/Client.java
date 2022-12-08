package com.kh.chap01_network.client.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

// 클라이언트용 TCP소켓 프로그래밍 순서
public class Client {

	public void clientStart() {
		// 1) 서버의 IP주소와 서버가 정한 "포트번호"를 매개변수로 하여 "클라이언트용소켓" 객체 생성
		int port = 30027;
		String str = null;
		String serverIp = null;
		Socket socket = null;
		
		try {
			// 현재(로컬)환경의 ip주소를 알아내는 부분
			serverIp = InetAddress.getLocalHost().getHostAddress();
			System.out.println(serverIp);
			
			// 서버에 연결을 요청하는 구문(요청하고자 하는 서버의 IP주소 + port번호 제시하면서 소켓 생성)
			socket = new Socket(serverIp, port);
			// 서버와 연결이 실패한다면 null 반환할 것 --> 즉, null이면 실패
			
			if(socket != null) {
				// 2) 서버와의 입출력 스트림 오픈
				InputStream is = socket.getInputStream(); // 서버로부터 값을 입력받을 스트림
				OutputStream os = socket.getOutputStream(); // 서버로 값을 출력하는 스트림
				
				// 3) 보조스트림을 통한 성능개선
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintWriter pw = new PrintWriter(os, true);
				
				// 4) Scanner를 통해 값을 입력받고, 스트림을 통해 입, 출력
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("서버에 보낼 내용 : ");
					str = sc.nextLine();
					pw.println(str);
					
					if(str == null || "exit".equals(str)) {
						System.out.println("접속 종료!!!");
						break;
					}
					String message = br.readLine();
					System.out.println("받은 메세지 : "+message);
				} while(true);	
				
				// 5) 통신 종료(스트림, 소켓 닫기)
				pw.close();
				br.close();
				socket.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
