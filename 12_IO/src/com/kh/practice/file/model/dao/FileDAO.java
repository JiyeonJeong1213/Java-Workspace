package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		File f = new File(file);
		
		return f.isFile();
	}
	public void fileSave(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String value = null;
			while((value = br.readLine())!=null) {
				sb.append(value+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	public void fileEdit(String file, String s) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
