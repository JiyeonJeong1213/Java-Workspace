package com.kh.chap03_class.model.vo;

public class Member {

	private String memberId; // - memberId : String
	private String memberPwd; // - memberPwd : String
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// + changeName(name:String):void
	public void changeName(String name) {
		memberName = name; // 필드명이랑 매개변수명이 달라서 this 안 써도 됨
	}
	// + printName():void
	public void printName() {
		System.out.println("이름은 : "+memberName);
	}
}
