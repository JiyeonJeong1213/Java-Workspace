package com.kh.chap04_field.model.vo;

/*
 * 변수구분
 * -전역변수 : 클래스 영역에서 바로 선언하는 변수 -> 클래스 내에서면 어디서든 사용 가능
 * -지역변수 : 클래스 영역 내의 특정 영역({})에 선언한 변수 -> 선언한 영역에서만 사용 가능
 *           ex) 메소드 영역 안, if문, for문 등등
 *           
 * 1. 전역변수(2가지로 구분 됨)
 * 	- 멤버변수 == 인스턴스 변수 == 필드
 * 		생성시점 : new 연산자를 통해서 해당 객체 생성하는 순간 메모리 영역에 할당
 * 		소멸시점 : 객체 소멸시 같이 소멸
 * 
 * 	- 클래스변수 == static변수 : static이라는 예약어가 붙어있냐 아니냐에 따라 멤버변수냐 클래스변수냐로 구분됨
 * 		생성시점 : 프로그램 실행과 동시에 메모리 영역(static영역)에 할당
 * 		소멸시점 : 프로그램이 종료될 때 소멸
 * 
 * 2. 지역변수
 * 		생성시점 : 특정구역({}) 실행(호출)시 메모리 영역에 할당(ex 메소드 실행시)
 * 		소멸시점 : 특정구역({}) 종료시 소멸(ex 메소드 종료시)
 */

//변수 선언 위치에 따른 구분(전역변수, 지역변수, 매개변수)
public class FieldTest1 { // FildTest1 클래스 시작
	//멤버변수(인스턴스변수, 필드)
	private int global;
	
	public void test(int num) { // test메소드 시작
		//매개변수(일종의 지역변수)
		
		// 지역변수(메소드 영역 내에 생성) => 지역변수에는 접근제한자 붙이지 않음
		// 지역변수에는 항상 값을 "초기화"시켜줘야 함 <-> 필드는 heap영역에 할당돼서 기본값으로 값 채워져서 안해도 됨
		int local = 100;
		
		if(true) {
			int a = 0; // 지역변수
			System.out.println(a);
		}
		
		// 멤버변수 출력시 에러가 안 나는 이유
		// 해당 클래스 객체 생성시 jvm이 값을 해당필드로 자동으로 대입시켜 줬기 때문
		// 물론, 명시적 초기화도 가능
		System.out.println(global);
		
		// 매개변수 출력시 에러 안 나는 이유
		// 해당 메소드(test)호출 시 반드시 값을 넘겨줘야 호출이 가능하기 때문에 num에는 반드시 어떤 값이든 초기화가 될 것
		System.out.println(num);
		
		// 초기화 해두지 않으면 에러가 남
		System.out.println(local);
		
		
	}

	
}
