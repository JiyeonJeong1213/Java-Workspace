package com.kh.chap02.loop;

public class B_While {

	/*
	 * while문
	 * [표기법]
	 * 
	 * [초기식;] // 초기식 생략 가능, 필수 아님
	 * while(조건식){ // 조건이 true일 경우 해당 구문들을 반복적으로 실행, 조건식 내용에 true작성시 무한반복
	 *       반복적으로 실행할 코드
	 *       [증감식]; // 필수는 아님
	 * }      
	 * 
	 * for문과 다르게 초기식, 증감식 필수 아님
	 * 
	 * 분기문에서 초기식, 증감식 없이 작성하는 법 배울 예정
	 */
	
	public void method1() {
		
		// for문을 while문으로, while문을 for문으로 표현할 수 있음
		
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요.");
		}
		
		int i=0; // 초기식
		while(i<5) { // 조건식
			System.out.println("안녕하세요.");
			i++; // 증감식
			}
		System.out.println("i : "+i); // i : 5
		
	}
	
	public void method2() {
		
		// 1~10사이의 정수 중 홀수만 출력
		// 처음에는 for문으로 그 다음에 while문으로 변경
		
		for(int i=1; i <= 10; i++) {
			if(i % 2==1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		int i= 1;
		while(i<=10) {
			if(i % 2==1) {
				System.out.print(i+" ");
			}
			i++;
		}
	}
	
	public void method3() {
		
		// 1부터 랜덤값(1~100)까지의 총 합계
		
		int random = (int)(Math.random()*100+1);
		// 0.0 <= 랜덤값 < 100.0
		// 1.0 <= 랜덤값 < 101.0
		// 1.0 <= 랜덤값 <= 100.0 -> 1<= 랜덤값 <= 100
		
		int sum=0;
		
//		int i=1;
//		while(i <= random) {
//			sum += i;
//			i++;
//		}
		
		System.out.print("1부터 "+random+"까지의 총 합계 : ");
		while(random>0) { //5 4 3 2 1
			sum += random--;
		}
		System.out.println(sum);
		
	}
	
	public void method4() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이 : "+str.length());
		
		int i = 0;
		while(i<str.length()) {
			System.out.println(str.charAt(i));
			i++;
		}
		
	}
	
	public void method5() {
		/*
		 * do-while문
		 * [표현법]
		 * do { // 조건검사 없이 무조건 한번은 do(실행) -> 조건이 맞지 않더라도 반드시 한번은 수행
		 *     실행할 코드
		 * } while(조건식); // 조건식의 결과가 true면 실행할 코드 다시 실행
		 *                // 조건식의 결과가 false면 반복문을 빠져나옴
		 *                
		 *                
		 * for/while문과 do-while문의 차이점
		 * for/while문은 처음 시작할 때 부터 조건검사를 하고 반환값이 true여야 실행을 하는데
		 * do-while문은 첫 실행은 무조건 조건검사 없이 실행
		 * 
		 * 일반적으로 거의 사용 안 됨 
		 */
	
		// 조건식이 맞지 않은 경우의 do-while문 테스트
		
		int num = 900;
		
		do {
			System.out.println("하이요");
		} while(num == 0);
	}

	public void method6() {
		// 1 2 3 4 5
		
		int i = 1;
		do {
			System.out.print(i++ +" ");
		} while(i <= 5);
	}
	
	public void method7() {
		// 1부터 사용자가 입력한 숫자까지의 총 합계
		// 1. do-while문 사용
		// "1부터 x까지의 총 합계 : xx"
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		System.out.print("1부터 "+num+"까지의 총 합계 : ");
		do {
			sum+=num--;
		} while(num>0);
		System.out.println(sum);
	}
	
}
