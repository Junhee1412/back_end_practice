package com.lec.ex05_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
	FileInputStream을 생성하는 방법은 2갸지가 있다.
	
	1. 문자열된 파일(위치, 경로)을 읽는 방법 
	   FileInputStream fis = new FileInputStream("파일");
	   
	2. File객체로 이미 생성되어 있는 경우
	
	   File file = new File("파일위치");
	   FileInputStream fis = new File(file);
*/
public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("src\\com\\lec\\ex04_writer\\WriterMain.java");
		int data;
		while((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		fis.close();
	}

}
