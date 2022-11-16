package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class C_DimensionalArray {

	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것 
	
	public void method1() {
		
		// 일차원 배열 선언
		int[] arr1;
		int arr2[];
		
		// 이차원 배열 선언
		int[][] arr3;
		int arr4[][];
		int[] arr5[];
		
		// 이차원 배열 선언과 동시에 할당
		// 자료형[][] 배열명 = new 자료형[행크기][열크기];
		int[][] arr = new int[3][5];
		
		System.out.println(arr); // [I@7637f22
		System.out.println(arr[0]); // [I@3830f1c0
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(arr[0][0]);
		
		System.out.println("행의 길이 : "+arr.length);
		
		// 각 행별 열의 길이 
		System.out.println("0번 열의 길이 : "+arr[0].length);
		System.out.println("1번 열의 길이 : "+arr[1].length);
		System.out.println("2번 열의 길이 : "+arr[2].length);
		
		/*
		 * 출력(arr[0][0]) -> 1행 1열
		 * 출력(arr[0][1]) -> 1행 2열
		 * ....
		 * 출력(arr[0][4]) -> 1행 5열
		 * -------------------------
		 * 
		 * 출력(arr[2][4]) -> 3행 5열
		 */
		
		/*
		 * 바깥쪽 for문 => 행에 대해 지정(0행~2행) == (0행~행의 크기-1) == (0행~arr.length-1)
		 * 안쪽 for문 => 열에 대해 지정(0열~5열) == (0열~각 행별 열의 크기-1) == (0열~arr[행의 인덱스].length-1)
		 */
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		
		// 순서대로 1, 2, 3, 4 ... 15 값을 넣어보기
		int[][] arr = new int[3][5]; // arr[0][0] -> 1, arr[0][1] -> 2, arr[2][4] -> 15
		
		// 값을 대입, 출력
		int literal = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = literal++;
				System.out.printf("%-3d", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method3() {
		
		// 일차원 배열 선언 및 할당과 동시에 초기화
		int[] arr = {1, 2, 3, 4, 5};
		
		// 이차원 배열 선언 및 할당과 동시에 초기화
		int[][] arr2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}}; //[3][5]
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t"); // \t : tab
			}
			System.out.println();
		}
	}
	
	public void method4() {
		
		/*
		 * 가변 배열
		 * 행의 크기는 정해져 있으나 각각의 행 별로 열의 길이가 정해져 있지 않은 상태
		 * 이차원 배열 == 일차원 배열 여러개를 묶은 형태
		 * 즉, 묶여있는 일차원 배열의 길이가 꼭 같은 필요는 없다.
		 * 
		 * 단, 행 크기는 생략 불가능, 반드시 지정해야 함
		 * 열 크기는 생략 가능. 각 행의 열의 길이가 변경 가능
		 */
		
		int[][] arr = new int[3][]; // 가변 배열 선언 (행의 크기는 3행)
		
		System.out.println(arr); // [[I@7637f22
		System.out.println(arr[0]); // null
		System.out.println(arr.length); // 3
		//System.out.println(arr[0][2]); // 오류 java.lang.NullPointerException
		// 아직 각 행별로 열의 크기가 지정되지 않았으므로 null값이 대입된 상태에서
		// 특정 인덱스로 접근하려 했기 때문에 NullPointerException 
		
		arr[0] = new int[2]; 
		arr[1] = new int[]{5, 6, 8};
		arr[2] = new int[4];
		/*
		 * 0 0
		 * 5 6 8 
		 * 0 0 0 0 
		 */
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++; 
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void method5() {
		
		// char[][] 가변 배열 생성
		char[][] arr = new char[3][];
		/*
		 * a b c
		 * d e
		 * f g h i j k 
		 */
		
		arr[0] = new char[3];
		arr[1] = new char[2];
		arr[2] = new char[6];
		
		char value = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				value = (char)(value+1);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		
		// 3행 3열짜리 String[][] 배열 생성 후 
		// 중첩 반복문을 이용해 현재 행, 열의 순번(인덱스)를 출력
		// (0, 0) (0, 1)
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}
	
	public void method7() {
		
		// int형 이차원 배열을 만들어
		// 0번행에는 국어점수를 3개 입력 받고
		// 1번행에는 영어점수를 3개 입력 받은 후
		// 각각 반복문을 활용해서 출력
		// 입력예시 : xx점수를 입력하세요 :
		// 출력예시 : xx점수 : xx xx xx
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				if(i==0) {
					System.out.print("국어 점수를 입력하세요 : ");
					arr[i][j] = sc.nextInt();
				}else {
					System.out.print("영어 점수를 입력하세요 : ");
					arr[i][j] = sc.nextInt();
				}
			}
		}

		System.out.print("국어 점수 : ");
		for(int i = 0; i < 1; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		

		System.out.print("영어 점수 : ");
		for(int i = 1; i < 2; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
	}
}
