package com.lec.ex05_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String org_img = "src/com/lec/ex05_file/blackpink.jfif";
		String cpy_img = "src/com/lec/ex05_file/blackpink.jpg";
		
		FileInputStream fis = new FileInputStream(org_img);
		FileOutputStream fos = new FileOutputStream(cpy_img);
		
		int readByte;
		byte[] readBytes = new byte[100];
		while((readByte = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByte);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("파일을 성공적으로 다운로드 했습니다!");
	}

}
