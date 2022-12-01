package com.kh.chap03_Char.run;

import com.kh.chap03_Char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		
		FileCharDao fc = new FileCharDao();
		//fc.fileSave();
		fc.fileRead();
	}
}
