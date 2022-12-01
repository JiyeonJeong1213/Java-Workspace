package com.kh.chap04_assist.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {

	// BufferedReader / BufferedWriter
	
	// 프로그램 --> 파일
	public void fileSave() {
		
//		BufferedWriter bw = null;
		
//		try {
//			/*
//			 * 1. 기반스트림(FileWriter) 객체 먼저 생성
//			 * 보조스트림도 Reader/Writer 계열이면 기반스트림도 Reader/Writer
//			 * 보조스트림도 Input/Output 계열이면 기반스트림도 Input/Output 
//			 */
//			bw = new BufferedWriter(new FileWriter("C_buffer.txt"));
//			
//			bw.write("안녕하세요.");
//			bw.newLine();
//			bw.write("안녕하세요.\n");
//			bw.write("안녕히가세요.");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try ~ with ~ resource 구문(jdk 7버전 이상부터 가능)
		/*
		 * try(스트림 객체 생성;){
		 * 
		 * 	// 예외가 발생할 수 있는 구문
		 * } catch(예외클래스명 e){
		 * 	// 예외 발생시 실행할 구문
		 * }
		 * 
		 * 스트림객체를 try(여기)에 넣어버리면
		 * 스트림객체 생성 후 해당 블록의 구문이 실행 완료되면 알아서 자원 반납이 됨
		 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C_buffer.txt"))){
			
			bw.write("안녕하세요.");
			bw.newLine();
			bw.write("안녕하세요.\n");
			bw.write("안녕히가세요.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	// 프로그램 <-- 외부매체(파일)
	public void fileRead() {
		
		// FileReader: 기반스트림
		// BufferedReader : 보조스트림
		
		try(BufferedReader br = new BufferedReader(new FileReader("C_Buffer.txt"))){
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
