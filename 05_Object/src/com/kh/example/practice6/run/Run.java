package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.*;

public class Run {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.inform();
		
		Book book2 = new Book("낮잠형 인간", "문학테라피", "로맹 모네리");
		book2.inform();
		
		Book book3 = new Book("밤잠형 인간", "문학산책", "정지연", 13000, 20.0);
		book3.inform();
	}

}
