package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String result = "";
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
		return result;
	}
	public String firstCap(String input) {
		String str = input.toUpperCase();
		return str.charAt(0)+input.substring(1);
	}
	public int findChar(String input, char one) {
		char[] array = input.toCharArray();
		int count = 0;
		for(char ch : array) {
			if(ch == one) {
				count++;
			}
		}
		return count;
	}
}
