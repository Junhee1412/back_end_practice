package com.lec.ex01_runtime;

/*
	NumberFormatExceptoion?
	
	프로그램에서 문자열로 되어 있는 숫자형데이터를 숫자로 변환하는 경우가
	자주 발생한다. 문자열을 숫자로 변환할 때 해당 문자열이 숫자로 구성된
	문자열이 아닐 경우 즉, 숫자로 변환할 수 없는 문자열일 경우에 발생되는
	예외이다.
	
	문자열을 숫자로 변화하는 방법(Wrapper Class)
	
	변환타입 메서드(매개변수)
	------------------------------
	int      Integer.parseInt(String str);
	double   Double.parseDouble(String str);

*/

public class NumberFormatMain {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "3.141592";
		
		System.out.println("문자열 = " + data1 + data2);
		
		int val1 = Integer.parseInt(data1);
		double val2 = Double.parseDouble(data2);
		
		System.out.println("숫자형 = "+(val1+val2));
		
		String data3 = "100a";
		int val3 = Integer.parseInt(data3);
	}

}
