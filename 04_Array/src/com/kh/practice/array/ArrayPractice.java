package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] array = new int[10];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
			System.out.print(array[i]+" ");
		}
	}
	
	public void practice2() {
		
		int[] array = new int[10];
		
		for(int i = array.length-1; i >= 0; i--) {
			array[i] = i+1;
			System.out.print(array[i]+" ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int[] array = new int[sc.nextInt()];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i+1;
			System.out.print(array[i]+" ");
		}
	}
	
	public void practice4() {
		
		String[] fruit = new String[] {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] array = new char[str.length()];
		for(int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			if(array[i]==i) {
				System.out.print("application에 i가 존재하는 위치(인덱스) : ");
			}
			
		}
	}
	
	public void practice6() {
		
		char[] array = {'월', '화', '수', '목', '금', '토', '일'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(array[num]);
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int[] array = new int[sc.nextInt()];
		
		for(int i = 0; i < array.length; i++) {
			Scanner literal = new Scanner(System.in);
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			array[i]=sc.nextInt();
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
