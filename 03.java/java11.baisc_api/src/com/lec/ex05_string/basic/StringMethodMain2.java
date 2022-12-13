package com.lec.ex05_string.basic;

import java.io.UnsupportedEncodingException;

public class StringMethodMain2 {

	public static void main(String[] args) {
		//6. charAt()
		
		String ssn = "991118-1234567";
		char gender = ssn.charAt(7);
		System.out.println(gender=='1' ? "남자" : "여자");
		
		//7. getBytes()
		//   1) getBytes()
		String str = "안녕하세요"; // utf-8 한글=3bytes, euc-kr 한글=2bytes
		
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length + "bytes");
		System.out.println(byte1);
		
		String str1 = new String(byte1);
		System.out.println("byte array(utf-8) -> String으로 변환 = " +str1);
		
		//   2) getBytes(문자셋)
		try {
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println(byte2.length + " bytes");
			String str2 = new String(byte2);
			System.out.println("byte array(EUC-KR) -> string으로 변환 = " + str2);
			
			byte[] byte3 = str.getBytes("utf-8");
			System.out.println(byte3.length + " bytes");
			String str3 = new String(byte3);
			System.out.println("byte array(utf-8) -> string으로 변환 = " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//8. indexOf()
		//매개값으로 주어진 문자열이 시작되는 위치(인덱스)를 정수로 리턴하는 메서드
		//만약, 주어진 문자열을 찾지 못했을 경우 -1을 리턴
		String 제목 = "2022.12.01일 현재 코로나 확산세 심각";
		int loc = 제목.indexOf("코로나");
		System.out.println(loc);
		
		if(제목.indexOf("코로나")>=0) {
			System.out.println("코로나 기사 검색을 성공적으로 완료했습니다.");
		}else {
			System.out.println("코로나 기사를 검색하지 못했습니다!");
		}		
	}
}
