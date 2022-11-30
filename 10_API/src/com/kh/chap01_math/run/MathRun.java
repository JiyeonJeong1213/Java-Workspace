package com.kh.chap01_math.run;

// import java.lang.*
// 생략가능 -> 보이진 않지만 항상 자동으로 java.lang패키지가 import되어 있음

public class MathRun {

	public static void main(String[] args) {

		// Math 클래스 (수학과 관련된 기능을 제공하고 있음)
		
		// 파이 => Math클래스 내에 상수필드로 정의되어 있음
		System.out.println("파이 값 : "+Math.PI);
		
		// 메소드명(매개변수) : 반환형
		// 올림 => Math.ceil(double) : 반환값 double형
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1));
		
		// 반올림 => Math.round(double) : 반환값 long형
		System.out.println("반올림 : "+Math.round(num1));
		
		// 버림 => Math.floor(double) : 반환값이 double형
		System.out.println("버림 : "+Math.floor(num1));
		
		// 가장 가까운 정수값을 알아낸 후 실수형 반환 : Math.rint
		System.out.println("가장 가까운 정수값 : "+Math.rint(num1));
		
		// 절대값 => Math.abs(int/double/long/float) : 반환값 매개변수값 그대로 => 오버로딩
		int num2 = -10;
		System.out.println("절대값 : "+Math.abs(num2));
		
		// 최소값 => Math.min(int, int) : 반환값 int => 오버로딩
		System.out.println("최소값 : "+Math.min(5, 10));
		
		// 최대값 => Math.max(int, int) : 반환값 int => 오버로딩
		System.out.println("최대값 : "+Math.max(5, 10));
		
		// 제곱근(루드) => Math.sqrt(double) : 반환값 double
		System.out.println("4의 제곱근 : "+Math.sqrt(8));
		
		// 제곱 => Math.pow(double, double) : 반환값 double
		System.out.println("2의 10제곱 : "+Math.pow(2, 10));
		
		/*
		 * java.lang.Math 클래스의 특징
		 * - 모든 필드 => 상수필드
		 * - 모든 메소드 => static메소드
		 * 
		 * 모든 게 다 static이기 때문에 "Math.필드명" or "Math.메소드명" 으로 다 접근 가능(객체 생성 필요 x)
		 * Math 클래스의 생성자가 private이다. (객체생성불가)
		 */
	}
}
