package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {

	private HashMap<String, Member> map = new HashMap();
	
	public boolean joinMembership(String id, Member m) {
		if(map.get(id)==null) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	public String logIn(String id, String password) {
		String name = null;
		if(map.get(id)!=null && map.get(id).getPassword().equals(password)) {
			name = map.get(id).getName();
		}
		return name;
	}
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.get(id)!=null && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			
			return true;
		}else {
			return false;
		}
	}
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}
	public TreeMap sameName(String name) {
		Set<String> set = map.keySet();
		TreeMap<String, String> tm = new TreeMap();
		
		for(String key :set) {
			if(map.get(key).getName().equals(name)) {
				tm.put(key, name);
			}
		}
		return tm;
	}
}
