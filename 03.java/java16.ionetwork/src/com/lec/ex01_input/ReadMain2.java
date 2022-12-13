package com.lec.ex01_input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadMain2 {

	public static void main(String[] args) throws Exception {
		// 2. read(byte[] b, len)
		InputStream is = new FileInputStream("src/com/lec/ex01_input/news.txt");
		int readByteNo;
		
		byte[] read_bytes = new byte[20];
		
//		readByteNo = is.read(read_bytes);
		readByteNo = is.read(read_bytes, 10, 3);
		
		for(int i=0;i<read_bytes.length;i++) {
			System.out.println((char)read_bytes[i]);
		}
		is.close();
	}

}

