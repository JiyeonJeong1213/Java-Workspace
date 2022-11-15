package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String result = "";
		
		switch (num) {
		case 1 : result = "입력";
		  	break;
		case 2 : result = "수정";
			break;
		case 3 : result = "조회";
			break;
		case 4 : result = "삭제";
		    break;
		case 7 : result = "종료";
		}
		
		if(result.equals("종료")) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println(result+" 메뉴입니다.");
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		}else { System.out.println("양수만 입력해주세요.");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor+math+eng;
		double avg = sum / 3.0;
		
		if (kor >= 40 && math >= 40 && eng >= 40 && avg >=60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+avg);
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1 :
		case 2 :
		case 12: System.out.println(month+"월은 겨울입니다."); break;
		case 3 :
		case 4 :
		case 5 : System.out.println(month+"월은 봄입니다."); break;
		case 6 :
		case 7 :
		case 8 : System.out.println(month+"월은 여름입니다."); break;
		case 9 :
		case 10 :
		case 11 : System.out.println(month+"월은 가을입니다."); break;
		default : System.out.println(month+"월은 잘못 입력된 달 입니다.");
		}
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if(id.equals("minmin")){
			if(pw.equals("Min1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}	
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();
		
		switch (str) {
		case "관리자" : System.out.print("회원관리, ");
		case "회원" : System.out.print("게시글 작성, 댓글 작성, ");
		case "비회원" : System.out.println("게시글 조회");		
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		System.out.println("BMI지수 : "+bmi);
		String result = "";
		
		if (bmi < 18.5) {
			result = "저체중";
		}else if (bmi < 23) {
			result = "정상체중";
		}else if (bmi < 25) {
			result = "과체중";
		}else if (bmi < 30) {
			result = "비만";
		}else {
			result = "고도비만";
		}
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력(+, - , *, /, %) : ");
		char ch = sc.nextLine().charAt(0);
		
		
		if (num1 > 0 && num2 > 0) {
			switch (ch) {
			case '+' : System.out.printf("%d %c %d = %d",num1, ch, num2, num1+num2 );break;
			case '-' : System.out.printf("%d %c %d = %d",num1, ch, num2, num1-num2 );break;
			case '*' : System.out.printf("%d %c %d = %d",num1, ch, num2, num1*num2 );break;
			case '/' : System.out.printf("%d %c %d = %f",num1, ch, num2, (double)num1/num2 );break;
			case '%' : System.out.printf("%d %c %d = %d",num1, ch, num2, num1%num2 ); break;
			default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}else {
			System.out.println("양수를 입력하세요.");
		}
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		System.out.print("과제 점수 : ");
		int hw = sc.nextInt();
		System.out.print("출석 회수 : ");
		int num = sc.nextInt();
		
		System.out.println("==========결과==========");
		
		double mid20 = mid * 0.2;
		System.out.println("중간 고사 점수(20) : "+mid20);
		
		double fin30 = fin * 0.3;
		System.out.println("기말 고사 점수(30) : "+fin30);
		
		double hw30 = hw * 0.3;
		System.out.println("과제 점수    (30) : "+hw30);
		
		System.out.println("출석 점수    (20) : "+(double)num);
		
		double sum = mid20+fin30+hw30+num;
		System.out.println("총점 : "+sum);
		
		if (sum >= 70) {
			if (num <= 14) {
				System.out.println("Fail [출석 회수 부족 ("+num+"/20)]");
			}else {
				System.out.println("PASS");
			}
		} else { System.out.println("Fail");
		
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/ 홀수");
		System.out.println("3. 합격/ 불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. p/F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		
		if (999 < pw || pw <= 9999) {
			int first = pw % 10; // 일의 자리수 구하기
			int second = (pw / 10) % 10; // 십의 자리수 구하기
			int third = (pw / 100) % 10; // 백의 자리수 구하기
			int forth = (pw / 1000) % 10; // 천의 자리수 구하기
			if (first != second && first != third && first != forth && second != third && second != forth && third != forth) {
				System.out.println("생성 성공");
			}else {
				System.out.println("중복 값 있음");
		}
		}else { 
			System.out.println("자리수 안 맞음");
		}
		
		
	}
		
		
		
	
	
	
}