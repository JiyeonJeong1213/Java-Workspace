package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int candy = num2 / num1;
		int rest = num2 % num1;
		
		System.out.println("1인당 사탕 개수 : "+candy);
		System.out.println("남은 사탕 개수 : "+rest);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int year = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적 : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", year, ban, num, name, (gender == 'M' ? "남학생" : "여학생"), grade);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String str = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";
		System.out.println(str);
	}         
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		System.out.println(sum);
		
		double avg = sum / 3.0;
		System.out.println(avg);
		
		System.out.println(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60 ? "합격" : "불합격" );
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String num = sc.nextLine();
		
		char result = num.charAt(7);
		
		System.out.println(result == '2' || result == '4' ? "여자" : "남자");
		//'1' == 1 -> 49 == 1 당연히 틀려서 false값 출력
	}
	
public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println(num3 <= num1 || num3 > num2 ? true : false );
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
 
		System.out.println(num1 == num2 && num2 == num3? true : false);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int numA = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int numB = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int numC = sc.nextInt();
		
		System.out.println("A사원의 연봉/연봉+a : "+numA+"/"+(double)(numA*=1.4));
		System.out.println((numA*=1.4) >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("B사원의 연봉/연봉+a : "+numB+"/"+(double)numB);
		System.out.println(numB >= 3000 ? "3000 이상" : "3000 미만");
		
		System.out.println("C사원의 연봉/연봉+a : "+numC+"/"+(double)(numC*=1.15));
		System.out.println((numC*=1.15) >= 3000 ? "3000 이상" : "3000 미만");
	}
	
	
}
