package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {

	private int propeller;
	
	public Ship() {
		
	}
	public Ship(String name, double mileage, String kind, int propeller) {
		super(name, mileage, kind); // new Vehicle(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	@Override
	public String information() {
		return super.information()+", propeller : "+propeller;
	}
	
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 물 속에서 나아간다.");
	}
	
}
