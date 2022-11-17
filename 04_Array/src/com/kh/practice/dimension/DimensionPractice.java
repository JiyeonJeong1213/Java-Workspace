package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "("+i+", "+j+")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		
        int[][] arr = new int[4][4];
		
		int value = 1;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		int[][] arr = new int[4][4];
		
		int value = 16;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		
		int[][] arr= new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j]; // 각 행의 모든 값의 합
				arr[3][j] += arr[i][j]; // 각 열의 모든 값의 합
				arr[3][3] += arr[i][j]*2; // 가로 세로의 총 합
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			if(row<0 || row>10 || col<0 || col>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			char[][] arr = new char[row][col];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (char)(int)(Math.random()*26+65);
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			break;
		}
	}
	
	public void practice6() {
		
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", "열", "니",
			"로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!!"}, {"..", "..", "..", "..", ".."}};
			
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < strArr[0].length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int size = sc.nextInt();
		
		char[][] arr = new char[size][];
		
		for(int i = 0; i < size; i++) {
			System.out.print(i+"행의 열 크기 : ");
			arr[i] = new char[sc.nextInt()];
		}
		
		char value = 'a';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value;
				if(value=='z') {
					value='a';
				}else {
				value++;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice8() {
		
		String[] student = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", 
				"진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int index = 0;
		
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = student[index];
				index++;
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = student[index];
				index++;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		
		String[][] arr1 = {{"강건강", "남나나"}, {"도대담", "류라라"}, {"문미미", "박보배"}};
		String[][] arr2 = {{"송성실", "윤예의"}, {"진재주", "차천축"}, {"피풍표", "홍하하"}};
				
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		char[] line = {'첫', '두', '세'};
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(arr1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %c번째 줄 %s쪽에 있습니다.", name, line[i], j == 0? "왼" : "오른");
				}
			}
		}
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				if(arr2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %c번째 줄 %s쪽에 있습니다.", name, line[i], j == 0? "왼" : "오른");
				}
			}
		}
	}
}
