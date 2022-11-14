package com.kh.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1; i <= num; i++)
				System.out.print(i+" ");
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice1();
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=num; i >= 1; i--)
				System.out.print(i+" ");
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice2();
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i <= num; i++) {
			sum += i;
			if(i < num) {
				System.out.print(i+" + ");
			}else {
				System.out.print(num);
			}
		}
		System.out.println(" = "+sum);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>=1 && num2>=1) {
			if(num1>num2) {
				for(; num2<=num1;num2++) {
					System.out.print(num2+" ");
				}
			}else {
				for(; num1<=num2;num1++) {
					System.out.print(num1+" ");
				}
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice4();
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num<=9) {
			for(; num<=9;num++) {
				System.out.println("==== "+num+"단 ====");
				for(int i=1; i<=9; i++) {
					System.out.printf("%d x %d = %d \n", num, i, num*i);
				}	
			}
		}else {
			System.out.println("9 이하의 숫자를 입력해주세요.");
			practice5();
		}
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		
		System.out.print("공차 : ");
		int gong = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num+" ");
			num += gong;
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();	
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice13() {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num>=2) {
			for(int i=1; i<=num; i++) {
				if(num != i && i != 1) {
					if(num % i == 0 ) {
						System.out.println("소수가 아닙니다."); break;
					}else {
						System.out.println("소수입니다."); break;
					}
				}
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2 이상의 정수 : ");
		int num = sc.nextInt();
		int count = 0;
		int check = 0;
		
		if(num>=2) {
			for(int i=2; i <= num; i++) {
				// i값이 소수인지 아닌지 검사
				for(int j=2; j<i; j++) {
					if(i % j == 0) {
						check++; // 소수가 아니면 check를 1로만들고 for문을 빠져나감
						break;
					}
				}
				if(check == 0) {
					count++; 
				}
				check=0;
			}
			System.out.println("2부터 "+num+"까지 소수의 개수는 "+count+"개입니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
	}
	
	public void practice15() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		while(true) {
			int num = sc.nextInt();
			if(num<0) {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			int count = 0;
			for(int i = 1;i<=num;i++) {
				if(i%2==0||i%3==0) {
					System.out.print(i+" ");
				}
				if(i%2==0 && i%3==0) {
					count++;
				}
			}
			System.out.println("\ncount : "+count);
			break;
		}
	}
	
	public void practice16() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
	
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<num/2+1; i++) {
			for(int j=0; j<num-i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void practice17() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			if(i==0 || i==num-1) {
				for(int j=0; j<num; j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				for(int j=0; j<num; j++) {
					if(j==0 || j==num-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}
	
	public void practice18() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=0;i<=num/2+1;i++) {
			for(int j=num-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num/2;i>=0;i--) {
			for(int j=0; j<num-i-1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void practice19() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int j=num-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=2*i;j++) {
				if(j==0 || j==2*i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1; i<num;i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(num-i)-1;j++) {
				if(j==0 || j==2*(num-i)-2) {
					System.out.print("*");
				}else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
	}
	
	
}
