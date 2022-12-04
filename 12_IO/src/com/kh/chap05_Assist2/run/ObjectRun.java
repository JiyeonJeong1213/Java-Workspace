package com.kh.chap05_Assist2.run;

import com.kh.chap05_Assist2.model.dao.ObjectDao;
import com.kh.chap05_Assist2.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectDao od = new ObjectDao();
		//od.fileSave("phone.txt"); // 객체단위로 기록되어 있기 떄문에 깨져서 보이지만 제대로 기록된 것
		//od.fileRead();
		
		ObjectsDao ods = new ObjectsDao();
		ods.fileSave("phoneList.txt");
		ods.fileRead();
		
	}

}
