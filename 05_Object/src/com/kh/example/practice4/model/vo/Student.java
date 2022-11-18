package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	{
		grade = 1;
		classroom = 10;
		name = "정지연";
		height = 164.7;
		gender = '여';
	}
	
	public Student() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
	public int classroom() {
		return classroom;
	}
	public String name() {
		return name;
	}
	public double height() {
		return height;
	}
	public char gender() {
		return gender;
	}
	
	public void information() {
		System.out.println(grade+"학년 "+classroom+"반 "+name+" : "+height+"cm, "+gender);
	}
}
