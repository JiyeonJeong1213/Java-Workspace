package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {

	private int[] lotto = new int[6];
	{
		for(int i = 0; i < lotto.length; i++) { // i = 0, 1, 2, 3, 4, 5
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public Lotto() {
		super();
	}
	
	public void setLotte(int[] lotto) {
		this.lotto = lotto;
	}
	public int[] getLotte() {
		return lotto;
	}
//	public void information() {
//		for(int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i]+" ");
//		}
//	}
	public void information() {
		System.out.println(Arrays.toString(lotto));
	}
}
