package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
//		FieldTest1 f1 = new FieldTest1(); // 객체 생성시 global 전역변수가 할당
//		
//		f1.test(109); // test메소드 호출 시 num, local 변수 할당
//		              // test메소드 종료 시 num, local 변수 소멸
//		
//		f1 = null; // 객체 소멸 시 global 멤버변수 소멸
//		
		
		//FieldTest2 f2 = new FieldTest2();
		
		// public -> 어딛서든 직접접근 가능
		//System.out.println(f2.pub);
		
		// protected -> 같은 패키지에서는 직접접근 가능/ 다른 패키지에서는 직접접근 불가
		//System.out.println(f2.pro);
		
		// default -> 같은 패키지에서만 직접접근 가능
		//System.out.println(f2.df);
		
		// private -> 해당 클래스 안에서만 
		//System.out.println(f2.pri);
		
		//System.out.println(FieldTest2.sta); // static변수는 객체 생성 없이 이렇게 호출
		
		System.out.println(Math.PI);
		
		FieldTest3.num=3;
		System.out.println(FieldTest3.num);
		
		// 상수필드 출력
		System.out.println(FieldTest3.NUM);
		//FieldTest3.NUM = 99; -> 값 변경 불가
		
		FieldTest3.test();
		
		// System, Math 클래스는 java.lang패키지에 속하고 항상 임포트가 되어있어서 따로 임포트 안해도 됨
		// 그리고 System.arraycopy나 Math.random 메소드는 static메소드라서 객체생성 필요 없이 패키지명.static메소드명으로 그냥 쓸 수 있다.
	}
}
