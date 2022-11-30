package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {
		super();
	}

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		
		// 방법1. String클래스 이용
		String result = "";
		while(st.hasMoreTokens()) {
			result += st.nextToken();
		}
	
		// 방법2. StringBuffer or StringBuilder 이용
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken());
		}
		
		return sb.toString();
	}
	public String firstCap(String input) {
		String str = input.substring(0, 1).toUpperCase();
		return str+input.substring(1);
	}
	public int findChar(String input, char one) {
		int count = 0;
		
		// 방법1. charAt 활용
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i)==one) { // a p p l e
				count++;
			}
		}
		
		// 방법2. toCharArray 활용
		char[] array = input.toCharArray(); // {'a', 'p', 'p', 'l', 'e'}
		for(char ch : array) {
			if(ch == one) {
				count++;
			}
		}
		
		return count;
	}
}
