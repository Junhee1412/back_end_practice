package com.lec.ex03_multi_catch;

public class MultiCatchMain3 {

	public static void main(String[] args) {
		
		try {
		String data1 = args[0];
		String data2 = args[1];
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		int result = val1+val2;
			System.out.println("더하기 결과 = " + result);
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행할 매개변수가 부족하거나 숫자변환을 할 수가 없습니다!!");
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다!!!");
		}finally {
			System.out.println("프로그램을 종료합니다!!");
		}
	}
}
