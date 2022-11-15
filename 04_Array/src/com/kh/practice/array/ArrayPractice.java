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
		int count = 0;
		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < array.length; i++) {
			array[i] = str.charAt(i);
			if(array[i]=='i') {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : "+count);
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
		int sum = 0;
		
		for(int i = 0; i < array.length; i++) {
			Scanner literal = new Scanner(System.in);
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			array[i]=sc.nextInt();
			sum += array[i];
		}
		System.out.println("총 합 : "+sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}
		
		int[] array = new int[num];
		for(int i = 0; i <= num/2; i++) {
			array[i] = i+1;
			System.out.print(array[i]+" ");
		}
		for(int i = num/2; i > 0; i--) {
			array[i]=i;
			System.out.print(array[i]+" ");
		}
		
	}
	
	public void practice9() {
		
		String[] array = {"후라이드", "양념", "파닭", "뿌링클", "간장"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();
		
		for(int i = 0; i < array.length; i++) {
			if(chicken.equals(array[i])) {
				System.out.printf("%s치킨 배달 가능 \n", chicken);
				return;
			}else {
				System.out.printf("%s치킨은 없는 메뉴입니다. \n", chicken);
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
}
