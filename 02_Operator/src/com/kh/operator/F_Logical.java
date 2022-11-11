package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리연산자
	 * 두개의 논리값을 연산하는 연산자
	 * 논리값 (논리연산자) 논리값 -> 결과값도 논리값
	 * 
	 * ANd 연산자 : 논리값 && 논리값 
	 *             왼쪽, 오른쪽 논리값이 둘 다 true여야 최종 결과가 true로 반환됨
	 * 
	 * Or 연산자 : 논리값 || 논리값
	 *            왼쪽, 오른쪽 논리값 중 어느 하나라도 true면 최종 결과가 true 
	 */
	
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수이면서 짝수인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num > 0) && (num % 2) == 0;
		// && 의미 : 그리고, ~이면서, ~이고 		
		
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까? "+result);
		
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		boolean result = (num >= 1) && (num <= 100);
				
		System.out.println("사용자가 입력한 값이 1이상 100이하 입니까? "+result);
		
		/*
		 * &&(AND) : 그리고, ~이면서, ~이고, ~뿐만아니라
		 *           두개의 조건 모두 true여야 결과값도 true
		 *           둘 중 하나라도 false일 경우 결과값은 false
		 */

	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 y 이거나 Y인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 진행하시려면 y 또는 Y를 입력하세요: ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y') || (ch == 'Y');
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까? "+result);
		
		/*
		 * ||(OR) : 또는, ~이거나
		 *          두개의 조건 중 하나라도 true일 경우 결과값 true
		 *          두개의 조건이 모두 false일 경우 결과값 false
		 */
	}
	
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = false && (++num1 > 0);
		System.out.println(num1); 
		/*
		 * 뒤의 비교연산 구문이 Dead code라고 뜸
		 * 실행할 때 오류는 나지 않지만 result값이 어차피 false인데 왜 작성했는지 물어보는 것 
		 */
		
		boolean result2 = true || (++num1 > 0);
		System.out.println(num1);
		
	}
}
