package com.kh.chap01_beforeVsafter.after.model.vo;

public class Product {

	/*
	 * 세 클래스 모두 공통적으로 기술되어 있던 요소(필드. 메서드)들만 추출해서 정의해둔 클래스 : 부모클래스
	 */
	private String brand;
	private String pCode;
	private String pName;
	private int price; // ctrl+f로 변경 

//	protected String brand;
//	protected String pCode;
//	protected String pName;
//	protected int price;
	
	public Product() {
		super();
	}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
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
	public String information() {
		return "brand : "+brand+", pCode : "+pCode+", pName : "+pName+", price : "+price;
	}
	
}
