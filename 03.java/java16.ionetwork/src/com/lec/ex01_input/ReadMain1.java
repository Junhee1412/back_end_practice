package com.lec.ex01_input;

import java.io.FileInputStream;
import java.io.InputStream;

/*
	InputStream
	
	InputStream은 바이트기반 입력스트림의 최상위 추상클래스이다. FileInputStream,
	BufferedInputStream, DataInputStream은 모두 InputStream을 상속하고 있다.
	
	InputStream의 주요메서드
	
	1. read()
	2. read(byte[] b)
	3. read(byte[] b, int off, int len)
	4. close()


*/
public class ReadMain1 {

	public static void main(String[] args) throws Exception {
		
		//1. read()
		InputStream is = new FileInputStream("src/com/lec/ex01_input/news.txt");
		System.out.println(is);
		
		int read_bytes;
		
		while(true) {
			read_bytes=is.read();// 1byte를 읽어서 4byte크기인 read_bytes로 리턴
			if(read_bytes==-1) break;
			System.out.println(read_bytes + " = " + (char)read_bytes);
		}
		is.close();
	}

}
