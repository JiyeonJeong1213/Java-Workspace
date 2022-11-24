package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {

	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.toString()+"\n면적 : "+x+", "+y+", "+radius+" / "+Math.PI*radius*radius;
	}
	public String calcCircum(int x, int y, int radius) {
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		return c.toString()+"\n둘레 : "+x+", "+y+", "+radius+" / "+Math.PI*radius*2;
	}
}
