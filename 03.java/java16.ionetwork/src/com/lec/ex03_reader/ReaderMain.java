package com.lec.ex03_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
	Reader클래스 주요메서드
	
	1. read()
	2. read(char[] c)
	3. read(char[] c, off, len)
	4. close()
*/
public class ReaderMain {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("src/com/lec/ex01_input/news.txt");
		
		// 1. read()
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.println(readData + " = " + (char)readData);
		}
		reader.close();
		System.out.println();
		
		// 2. read(char[] c)
		reader = new FileReader("src/com/lec/ex01_input/news.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
		System.out.println("-------------------------------------");
		
		
		// 3. read(char[] c, off, len)	
		reader = new FileReader("src/com/lec/ex01_input/news.txt");
		int readNo;
		char[] cbuf2 = new char[10];
		readNo = reader.read(cbuf2, 1, 4);
		for(int i=0;i<cbuf2.length;i++) {
			System.out.println(cbuf2[i]);
		}
		reader.close();
		
	}

}

