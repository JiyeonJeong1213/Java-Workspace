package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 *   Java.util.Date 클래스
		 * - 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * - 자바 개발 초창기에 급하게 만들어서 완성도가 높지 않은 클래스(다국적으로 쓰기 적합x)
		 */
		
		// 기본생성자를 통해 Date객체 생성 => 현재 날짜 및 시간을 가지고 옴
		Date today = new Date();
		System.out.println("기본생성자 : "+today); // Date클래스 안에 Tostring메소드가 값을 리턴하도록 오버라이딩 되어 있음
		
		// 내가 원하는 날짜(2022년 11월 4일)
		// 방법1. 매개변수 있는 Date클래스 생성자를 통해 변경
		//Date date1 = new Date(2022, 11, 4); // Deprecated : 권장하지 않음
		// 내부적으로 내가 전달할 년도 + 1900 => 셋팅을 하고자 하는 년도 - 1900
		// 내가 전달한 월 +1 => 월 -1
		Date date1 = new Date(2022-1900, 11-1, 4, 15, 30, 0);
		System.out.println("매개변수생성자 : "+date1);
		
		// "2022년 11월 4일 9시 0분 0초"
		// 내 입맛대로 포맷을 지정한 문자열을 받고자할 때
		// java.text.SimpleDateFormat
		
		// 1. 형식을 지정하면서 SimpleDateFormat 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf객체에서 제공하는 format메소드 호출하면서 Date객체 전달 => 포맷에 지정한 형식대로 String 문자열 반환
		//    sdf.format(Date객체) : String
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		String formatDate1 = sdf.format(date1);
		System.out.println(formatDate1);
	}

}
