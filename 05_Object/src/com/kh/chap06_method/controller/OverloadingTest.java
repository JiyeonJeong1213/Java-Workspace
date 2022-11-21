package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * - 한 클래스 내에 "같은" 메소드명으로 정의할 수 있는 방법
	 * - 매개변수의 자료형의 개수나 타입이나 순서가 다르게 작성하면 됨
	 * - 단, 매개변수명, 접근제한자, 반환형은 메소드 오버로딩에 "전혀" 영향을 주지 않는다.
	 */

	public void test() {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	// 에러발생
	// - 매개변수명과는 상관없이 자료형의 개수와 순서가 같아서 발생
	// - 즉, 매개변수의 자료형의 개수나 순서가 다르게 작성되어야 함
//	public void test(int c, int d) {
//	}

	public void test(int a, int b, String s) {
		
	}
	
	// 에러발생
	// - 반환형이 다르다고 오버로딩이 적용되지 않음
	// - 메소드를 호출하는 시점에 매개변수가 동일하기 때문에 에러발생
	// - 즉, 반환형과 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 함
//	public int test(int a, int b, String s) {
//		return a+b;
//	}
	
	// 에러발생
	// - 접근제한자가 다르다고 오버로딩이 적용되지 않음
	// - 즉, 접근제한자와 상관없이 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 함
//	private void test(int a, int b, String s) {
//		
//	}
	
	
}
