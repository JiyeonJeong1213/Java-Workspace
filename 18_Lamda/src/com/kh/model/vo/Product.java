package com.kh.model.vo;

public class Product {

	private String pName;
	private int price;
	private int stock;
	
	public Product() {
		super();
	}
	public Product(String pName, int price, int stock) {
		super();
		this.pName = pName;
		this.price = price;
		this.stock = stock;
	}
	
	public String getpName() { // 첫 두글자가 둘 다 소문자가 아니면 camelCase변환 안함
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Product [pName=" + pName + ", price=" + price + ", stock=" + stock + "]";
	}
}
