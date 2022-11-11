package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	Scanner sc = new Scanner(System.in);
	
	public void test4() {
		
		System.out.print("문자열을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.println("첫번째 문자: "+name.charAt(0));
		
		System.out.println("두번째 문자: "+name.charAt(1));
		
		System.out.println("세번째 문자:"+name.charAt(2));
		
		
	}
	
	
	
			
	
}
