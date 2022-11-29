package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 지정 문자열");
			System.out.println("2. 입력 문자열");
			System.out.println("3. 프로그램 끝내기");
			System.out.println("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : tokenMenu(); break;
			case 2 : inputMenu(); break;
			case 3 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			default: 
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}	
	}
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";
		System.out.print("토큰 처리 전 글자 : ");
		System.out.print("토큰 처리 전 개수 :");
		
	}
	public void inputMenu() {
		
		
	}
}
