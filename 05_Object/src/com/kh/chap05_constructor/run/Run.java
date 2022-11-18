package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		User user1 = new User();
		user1.setUserId("user01");
		user1.setUserPwd("pass00");
		user1.setUserName("정지연");
		
		User user2 = new User("user01", "pass01", "김철수");
		System.out.println(user2.information());
		
		User user3 = new User("user3", "pass03", "김나나", 17, '여');
		System.out.println(user3.information());
		
	}

}
