package com.lec.ex03_multi_catch;

public class MultiCatchMain2 {

	public static void main(String[] args) {
		
		try {
		String data1 = args[0];
		String data2 = args[1];
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);
		int result = val1+val2;
			System.out.println("더하기 결과 = " + result);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행할 매개변수가 부족합니다");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가능합니다!!");
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다!!!");
		}finally {
			System.out.println("프로그램을 종료합니다!!");
		}
	}
}
