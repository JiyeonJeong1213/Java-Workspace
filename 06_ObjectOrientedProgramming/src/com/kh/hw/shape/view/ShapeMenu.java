package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		System.out.println("===== 도형 프로그램 =====");
		System.out.println("3. 삼각형\n4. 사각형\n9. 프로그램 종료");
		System.out.print("메뉴 번호 : ");
		int type = sc.nextInt();
		if(type == 9) {
			System.out.println("프로그램을 종료합니다.");
			return;
		}else if(type == 3) {
			triangleMenu();
		}else if(type == 4) {
			squareMenu();
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			inputMenu();
		}
	}
	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적/n2.삼각형 색칠/n3.삼각형 정보/n9.메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		int type = 3;
		inputSize(type, menuNum);
	}
	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레/n2. 사각형 면적/n3. 사각형 색칠/n4. 사각형 정보/n9. 메인으로");
		System.out.println("메뉴 번호 :");
		int menuNum = sc.nextInt();
		int type = 4;
		inputSize(type, menuNum);
	}
	public void inputSize(int type, int menuNum) {
			if(type == 3) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("삼각형 면적 : "+tc.calcArea(height, width));
				triangleMenu();
			}else if(menuNum == 2) {
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				triangleMenu();
			}else if(menuNum == 3) {
				System.out.println(tc.print());
				triangleMenu();
			}else if(menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
			}	
		}else if(type == 4) {
			if(menuNum == 1) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("사각형 둘레 : "+scr.calcPerimeter(height, width));
				squareMenu();
			}else if(menuNum == 2) {
				System.out.print("높이 : ");
				int height = sc.nextInt();
				System.out.print("너비 : ");
				int width = sc.nextInt();
				System.out.println("사각형 면적 : "+scr.calcArea(height, width));
				squareMenu();
			}else if(menuNum == 3) {
				System.out.print("색깔을 입력하세요 : ");
				sc.nextLine();
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
				squareMenu();
			}else if(menuNum == 4) {
				System.out.println(scr.print());
				squareMenu();
			}else if(menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				inputMenu();
			}	
		}else {
			System.out.println("잘못된 번호입니다. 다시 입력하세요.");
		}
	
		
	}
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else {
			System.out.println(scr.print());
		}
	}
}
