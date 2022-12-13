package com.lec.ex03_datatypes;

public class FloatDoubleMain {

	public static void main(String[] args) {
		// 실수타입은 기본적으로 정밀도의 문제가 있다.
		double d1 = 3.14;
		double d2 = 3.14d;
		double d3 = 3.14D;
		
		// float f1 = 3.14;
		float f1 = (float)3.14;
		float f2 = 3.14f;
		float f3 = 3.14F;

		float f4 = 0.1234567890123456789F;
		double d4 = 0.1234567890123456789D;
		
		System.out.println("f4 = " + f4 + ", d4 = " + d4);
		
		// 실수는 0.1을 표현할 때 정확하게 표현불가 즉, 정확한 값이 아니라 0.1에 근사치가 리턴된다.
		System.out.println("1.0 - 0.9 = " + (1.0 - 0.9));
		
		// 실수의 정확한 연산은 정수로 변환한 후에 연산을 해야 정확하게 0.1을 계산할 수 있다.
		System.out.println("1.0 - 0.9 = " + (1.0*10 - 0.9*10)*0.1);
		
		// e지수
		int i5 = 3000000;
		double d5 = 3e6;
		float f5 = 3e6f;
		double d6 = 3e-6;
		System.out.println(d6);
	}

}
