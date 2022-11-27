package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	public int existMemberNum() {
		int count = 0;
		for(int i = 0 ; i < m.length; i++) {
			if(m[i]!=null) {
				count++;
			}
		}
		return count;
	}
	public boolean checkId(String inputId) {
		boolean result = true;
		for(Member mem : m) {
			if(mem.getId().equals(inputId)) {
				result = false;
			}
		}
		return result;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		m[existMemberNum()] = new Member(id, name, password, email, gender, age);
	}
	public String searchId(String id) {
		String result="";
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				result=m[i].inform();
			}
		}
		return result;
	}
	public Member[] searchName(String name) {
		Member[] member = new Member[1];
		for(Member mem : m) {
			if(mem.getName().equals(name)) {
				member[0]=mem;
			}
		}
		return member;
	}
	public Member[] searchEmail(String email) {
		Member[] member = new Member[1];
		for(Member mem : m) {
			if(mem.getEmail().equals(email)) {
				member[0]=mem;
			}
		}
		return member;
		
	}
	public boolean updatePassword(String id, String password) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setPassword(password);
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean updateName(String id, String name) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setName(name);
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean updateEmail(String id, String email) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i].setEmail(email);
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean delete(String id) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(id)) {
				m[i]=null;
			}else {
				result = false;
			}
		}
		return result;
	}
	public void delete() {
		Member[] m = null;
	}
	public Member[] printAll() {
		return m;
	}
}
