package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	Scanner sc = new Scanner(System.in);
	
	public void test3() {
		
		System.out.print("가로: ");
		double hor = sc.nextDouble();
		
		System.out.print("세로: ");
		double ver = sc.nextDouble();
		
		System.out.println("면적: "+(hor*ver));
		
		System.out.println("둘레: "+(hor+ver)*2);
	}
}
