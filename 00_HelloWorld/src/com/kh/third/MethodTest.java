package com.kh.third;

public class MethodTest {

	public void printMethodA() {
		
		System.out.println("프린트메서드A 출력중!!");
		
		printMethodB();
		
	}
	
	public void printMethodB() {
		
		System.out.println("프린트메서드B 출력중!!");
		
		printMethodC();
		
	}
	
	public void printMethodC() {
		
		System.out.println("프린트메서드C 출력중!!");
		
		//printMethodA();
		
	}
	
}
