package com.lec.ex02_trycatch;

public class TryCatchMain2 {

	public static void main(String[] args) {
		//2. 실행예외
		String data1 = null;
		String data2 = null;
		
		try {
			data1=args[0];
			data2=args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행할 매개변수가 부족합니다");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		}
		System.out.println();
		System.out.println(data1 + ", " + data2);
		
		try {
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			int result = val1+val2;
			System.out.println("더하기 결과 = "+result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가능합니다!!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
	}
}
