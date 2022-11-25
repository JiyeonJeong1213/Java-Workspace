package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;

public class LibraryController {

	private Member mem = null;
	private Book[] bList = {new CookBook ("백종원의 집밥", "백종원", "tvN", true), 
			new AniBook("한번 더 해요", "미티", "원모어", 19), 
			new AniBook("루피의 원피스", "루피", "japan", 12), 
			new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false), 
			new CookBook("최현석 날 따라해봐", "최현석", "소금책", true)};
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	public Member myInfo() {
		return mem;
	}
	public Book[] selectAll() {
		return bList;
	}
	public Book[] searchBook(String keyword) {
		Book[] books = new Book[5];
		int index = 0;
		for(Book bk : bList) {
			if(bk.getTitle().contains(keyword)) { // 포함의 개념 .contains()
				books[index++] = bk;
			}
		}
		return books;
	}
	public int rentBook(int index) {
		int result = 0;
		if(bList[index] instanceof AniBook) {
			
			if(((AniBook)bList[index]).getAccessAge()>mem.getAge()) {
				result = 1;
			}
		}else {
			if(((CookBook)bList[index]).isCoupon()) {
				mem.setCouponCount(mem.getCouponCount()+1);
				result = 2;
			}
		}
		return result;
	}
	
}
