package com.kh.practice.dimension;

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
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(i<=2 && j<=2) {
					arr[i][j] = (int)(Math.random());
				}else if (i==3&& j<=2) {
					arr[i][j] += arr[i][j]; 
				}else {
					
				}
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	
	
}
