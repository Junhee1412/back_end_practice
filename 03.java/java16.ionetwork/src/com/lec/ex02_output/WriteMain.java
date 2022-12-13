package com.lec.ex02_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/*
	OutputStream
	
	FileOutputStream, PrintOutputStream, BufferedOutputStream, DataOutputStream은 모두
	OutputStream을 상속한다.
	
	OutputStream의 주요메서드
	
	1. write(int byte)
	2. write(byte[] b)
	3. write(bute[] b, off, len)
	4. flush()
	5. close()
	
*/
public class WriteMain {

	public static void main(String[] args) throws Exception {
				
		// 1. write(int byte)
		OutputStream os = new FileOutputStream("src/com/lec/ex02_output/output1.txt");
		byte[] data = "대한민국만세".getBytes();
		//System.out.println(data);
		for(int i=0;i<data.length;i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
		
		
		// 2. write(byte[] b)
		os = new FileOutputStream("src/com/lec/ex02_output/output2.txt");
		data = "1234567890".getBytes();
		os.write(data);
		os.flush();
		os.close();
		
		// 3. write(bute[] b, off, len)
		os = new FileOutputStream("src/com/lec/ex02_output/output3.txt");
		data = "1234567890".getBytes();
		os.write(data,1 ,3);
		os.flush();
		os.close();
	}

}






