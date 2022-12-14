package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString()+"\n면적 : "+x+", "+y+", "+height+" ,"+width+ " / "+height*width;
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		return r.toString()+"\n둘레 : "+x+", "+y+", "+height+" ,"+width+ " / "+2*(height+width);
	}
}
