package com.lec.ex02_arithmetic;

public class ChechOverflowMain {

	public static void main(String[] args) {
		System.out.println("int 타입의 최대값" + Integer.MAX_VALUE);
		System.out.println("int 타입의 최소값" + Integer.MIN_VALUE);
//		int result = 2000000000 + 2000000000;
//		System.out.println(result);
		
		try {
		int result = safeAdd(2000000000, 2000000000);
		System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Overflow가 발생해서 정확한 연산을 수행할 수 없습니다!!!");
		}
	}
	
	public static int safeAdd(int left, int right) {// return이 있으면 데이터타입을 지정해야하고(int) return이 없으면 void를 준다.
		
		if(right>0) {
			 if(left > Integer.MAX_VALUE - right) {
				 //사용자가 강제로 예외를 발생시키는 방법
				 throw new ArithmeticException("Overflow가 발생했습니다!");
			 }
		}else {
			if(left < Integer.MIN_VALUE -right) {
				throw new ArithmeticException("Underflow가 발생했습니다!");
			}
		}
		return left+right;
	}
}
