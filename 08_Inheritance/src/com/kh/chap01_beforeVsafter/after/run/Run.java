package com.kh.chap01_beforeVsafter.after.run;

import com.kh.chap01_beforeVsafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVsafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVsafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		Desktop d = new Desktop("삼성", "d-01", "삼성데스크탑", 1500000, true);
		
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰14", 1400000, "LG");
		
		Tv t = new Tv("엘지", "t-01", "얇은 티비", 3500000, 60);
		
		/*
		 * 실행하고자 하는 메소드가 자식클래스에 없다면 자동으로 부모클래스에 있는 메소드가 실행됨
		 * 단, 자식클래스에서 오버라이딩(메소드 재정의)가 되어있을 경우
		 * 자식클래스에 있는 오버라이딩 된 메소드가 우선권을 가짐
		 */
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		/*
		 * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스들을 작성 가능
		 * - 중복된 코드를 공통적으로 관리하기 때문에 새로운 코드를 추가하거나 수정할 때 용이
		 *	 => 프로그램 생산성과 유지보수에 크게 기여 
		 * 
		 * 
		 * 상속의 특징
		 * - 클래스간의 상속은 다중상속이 불가능함(단일상속만 가능)
		 * - 명시되어 있지 않지만 모든 클래스(말그대로 모든 클래스)는 Object클래스의 후손
		 *	 => Object클래스에 있는 메소드를 쓸 수 있다.
		 *	 => Object클래스에 있는 메소드가 맘에 안 들면 오버라이딩을 통해 재정의가 가능
		 */
		
	}

}
