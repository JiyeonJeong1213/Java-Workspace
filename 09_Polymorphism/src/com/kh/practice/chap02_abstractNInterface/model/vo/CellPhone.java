package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {

	public String charge();
	
	@Override
	public String makeCall();
	
	@Override
	public String takeCall();
	
	@Override
	public String picture();
}
