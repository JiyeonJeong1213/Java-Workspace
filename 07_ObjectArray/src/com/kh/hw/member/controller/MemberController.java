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
			if(mem != null && mem.getId().equals(inputId)) {
				result = false;
			}
		}
		return result;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i]==null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	public String searchId(String id) {
		String result="";
		for(Member mem : m) {
			if(mem != null && mem.getId().equals(id)) {
				result=mem.inform();
				break;
			}
		}
		return result;
	}
	public Member[] searchName(String name) {
		Member[] member = new Member[SIZE];
		int index = 0;
		for(Member mem : m) {
			if(mem != null && mem.getName().equals(name)) {
				member[index++]=mem;
			}
		}
		return member;
	}
	public Member[] searchEmail(String email) {
		Member[] member = new Member[SIZE];
		int index = 0;
		for(Member mem : m) {
			if(mem != null && mem.getEmail().equals(email)) {
				member[index++]=mem;
			}
		}
		return member;
		
	}
	public boolean updatePassword(String id, String password) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				break;
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean updateName(String id, String name) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				m[i].setName(name);
				break;
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean updateEmail(String id, String email) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				break;
			}else {
				result = false;
			}
		}
		return result;
	}
	public boolean delete(String id) {
		boolean result = true;
		for(int i = 0; i < m.length; i++) {
			if(m[i]!=null && m[i].getId().equals(id)) {
				m[i]=null;
				break;
			}else {
				result = false;
			}
		}
		return result;
	}
	public void delete() {
		Member[] m = new Member[SIZE];
	}
	public Member[] printAll() {
		return m;
	}
}
