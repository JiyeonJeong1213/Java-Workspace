package com.kh.enumBasic;

public class EnumRun {
	/*
	 * Enum => Enumeration(열거)의 약자형
	 * 기존에 사용하던 상수를 정의하는 방법 중 static final과 같은 기능 함
	 * 문자열 혹은 숫자들을 나타내는 기본자료형을 Enum을 통해서 표현할 수 있다
	 * 
	 * 1 -> true , true -> true
	 * 
	 * 1 -> 일반게시판, 2 -> 썸네일 게시판, 3 -> xxx게시판
	 */
	public static final String MONDAY = "MON";
	public static final String TUESDAY = "TUE";
	public static final String WEDNESDAY = "WEN";
	public static final String THURSDAY = "THU";
	public static final String FRIDAY = "FRI";
	public static final String SATURDAY = "SAT";
	public static final String SUNDAY = "SUN";
	/*
	 * 위처럼 상수를 정의했을 때 단점
	 * 1) 가독성 떨어짐
	 * 2) 오타가 났을 때 원하는 결과가 나오지 않을 수 있음
	 * 3) monday라는 문자열을 저장하고 싶을 경우 -> 새롭게 선언해줘야 함
	 * 4) 상수필드 가지고 반복문을 통해 값을 가져올 수 없음
	 */
	enum EnumTest{
		MONDAY, // static, final 키워드를 붙이지 않았는데 자동으로 추가해줌
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}
	public static void main(String[] args) {
		// 상수에 담긴 값 생성하는 법
		System.out.println(EnumTest.MONDAY);
		System.out.println(EnumTest.MONDAY.name());
		
		// enum으로 만들어둔 클래스는 객체 생성(new Day1();)없이 사용 가능
		System.out.println(Day1.MONDAY);
	
		// enum필드 안에 담긴 값을 반환해주는 메소드
		System.out.println(Day2.MONDAY.shorName());
		System.out.println(Day3.SUNDAY.day());
		
		// enum에서 사용 가능한 메소드들
		// 1) valueOf => 일치하는 이름의 enum값들을 가져옴
		System.out.println(Day3.valueOf("MONDAY"));
		// 2) values() => 열거형 상수(enum)들을 배열형태로 리턴
		for(Day3 day : Day3.values()) {
			System.out.println(day);
		}
		System.out.println("=====================================================");
		// 3) 직접 추가한 메소드들 
		//    (printDay1처럼 공용메소드를 만들거나 printDay처럼 추상메소드 만든 후 각 상수필드에서 오버라이딩 해서 사용)
		System.out.println(Day3.valueOfShortName("MON"));
		System.out.println(Day3.valueOfDay(4).name());
		
		Day4.SATURDAY.printDay();
		Day4.SUNDAY.printDay1();
		/*
		 * 상수(enum) 사용하는 이유
		 * 1) 코드가 간결해져서 가독성이 좋음
		 * 2) 데이터그룹 관리 및 연관관계 표현에 용이함
		 * 		ex) 하나의 요일에 해당하는 데이터들(MON, MONDAY, 1, 월요일)을 하나의 상수필드로 합칠 수 있다.
		 * 		ex) true, Y, 1
		 * 3) 상수별로 다른 메서드를 사용해야 할 때 쉽게 구현이 가능하다.
		 */
	}

}
