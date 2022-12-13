package com.lec.ex01_op;

public class SignOperatorMain {

	public static void main(String[] args) {
		
		int x = 100;
		int result1 = -x;
		int result2 = +x;
		System.out.println(result1);
		System.out.println(result2);
		
		// 부호연산시 주의할 점
		short s = 100;
		
		// short result3 = -s; // 부호연산도 기본타입은 int이다.
		int result3 = -s;
		System.out.println(result3);
	}
}
