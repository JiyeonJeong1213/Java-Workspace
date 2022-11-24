package com.kh.chap01_beforeVsafter.after.model.vo;


public class SmartPhone extends Product {

	private String mobileAgent;
	
	public SmartPhone() {
		
	}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgent) {
		super(brand, pCode, pName, price);
		this.mobileAgent = mobileAgent;
	}
	
	public void setMobileAgent(String mobileAgent) {
		this.mobileAgent = mobileAgent;
	}
	public String getMobileAgent() {
		return mobileAgent;
	}	
	
	public String information() {
			return super.information()+", mobileAgent  : "+mobileAgent;
	}
}
