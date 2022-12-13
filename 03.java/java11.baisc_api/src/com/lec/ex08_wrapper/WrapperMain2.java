package com.lec.ex08_wrapper;

public class WrapperMain2 {

	public static void main(String[] args) {
		// 1. 박싱
		int val1 = Integer.valueOf("100");
		
		// 2. 파싱 : 문자열을 숫자로 
		int val2 = Integer.parseInt("100");
		double val3 = Double.parseDouble("3.1415");
		double val4 = Double.parseDouble("3.1415D");
		float val5 = Float.parseFloat("3.1415");
	}

}