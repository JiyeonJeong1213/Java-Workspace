package com.kh.example.practice3.model.vo;

public class Circle {

	private static final double PI = 3.14;
	private int radius ;
	
	{ // 초기화블럭 잘 사용 안 함
		radius = 5;
	}
	
	public Circle() {
		
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {
		radius++;
		System.out.println(radius*PI*2);
		System.out.println(radius*radius*PI);
	}
	
	public void getAreaOfCircle() {
		System.out.println(radius*PI*2);
	}
	
	public void getSizeOfCircle() {
		System.out.println(radius*radius*PI);
	}
}
