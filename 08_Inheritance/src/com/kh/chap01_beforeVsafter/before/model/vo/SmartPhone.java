package com.kh.chap01_beforeVsafter.before.model.vo;

public class SmartPhone {

	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgent;
	
	public SmartPhone() {
		
	}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgent) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgent = mobileAgent;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPcode(String pCode) {
		this.pCode = pCode;
	}
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMobileAgent(String mobileAgent) {
		this.mobileAgent = mobileAgent;
	}
	public String getBrand() {
		return brand;
	}
	public String getPcode() {
		return pCode;
	}
	public String getPname() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getMobileAgent() {
		return mobileAgent;
	}
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price+", "+mobileAgent;
	}
}
