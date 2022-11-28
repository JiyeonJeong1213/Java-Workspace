package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay {

	private String maker;

	public SmartPhone() {
		super();
	}
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String printInformaion() {
		return "";
	}
	@Override
	public String touch() {
		return null;
	}
	@Override
	public String charge() {
		return null;
	}
	@Override
	public String makeCall() {
		return null;
	}
	@Override
	public String takeCall() {
		return null;
	}
	@Override
	public String picture() {
		return null;
	}
	
	
}
