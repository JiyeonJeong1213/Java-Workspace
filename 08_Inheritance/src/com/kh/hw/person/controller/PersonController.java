package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.*;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] count = new int[2];
		int num = 0;
		for(Student std : s) {
			if(std != null) {
				count[0] = ++num;
			}
		}
		
		num = 0;
		for(Employee emp : e) {
			if(emp != null) {
				count[1] = ++num;
			}
		}
		return count;
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i]==null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
	}
	public Student[] printStudent() {
//		Student[] printStd = new Student[personCount()[0]];
//		int resultIndex = 0;
//		for(int i = 0; i < s.length ; i++) {
//			if(s[i]!=null) {
//				printStd[resultIndex] = s[i];
//				resultIndex++;
//			}
//		}
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
	}
	public Employee[] printEmployee() {
//		Employee[] printEmp = new Employee[personCount()[1]];
//		int resultIndex = 0;
//		for(int i = 0; i < e.length; i++) {
//			if(e[i]!=null) {
//				printEmp[resultIndex] = e[i];
//				resultIndex++;
//			}
//		}
		return e;
	}
}
