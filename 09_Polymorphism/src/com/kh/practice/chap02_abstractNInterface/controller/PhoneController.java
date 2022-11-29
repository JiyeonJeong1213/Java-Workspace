package com.kh.practice.chap02_abstractNInterface.controller;

import com.kh.practice.chap02_abstractNInterface.model.vo.*;

public class PhoneController {

	private String[] result = new String[2];
	
	public String[] method() {
		Phone[] p = new Phone[2];
		p[0] = new GalaxyNote9("삼성");
		p[1] = new V40("LG");
		
		int count = 0;
		for(Phone ph : p) {
			if(ph instanceof GalaxyNote9) {
				result[count++]=((GalaxyNote9) ph).printInformaion();
			}else {
				result[count++]=((V40)ph).printInformaion();
			}
		}
		return result;
	}
}
