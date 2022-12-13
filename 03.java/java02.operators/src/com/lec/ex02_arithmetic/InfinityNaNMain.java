package com.lec.ex02_arithmetic;

public class InfinityNaNMain {

	public static void main(String[] args) {
		// /, %연산을 할 경우 주의할 점
		// 좌측의 피연산자가 정수타입인 경우 나누는 수인 우측 피연산자는 0을 사용할 수가 없다.
		// 정수 타입인 0으로 나누는 경우 ArithmeticException 예외가 발생한다.
		// 그러나 실수타입인 0.0 or 0.0F로 나누는 경우 예외가 발생되지 않고 나누기 연산의 결과가
		// 무한대(Infinity) 값을 가지고 나머지연산(%)의 결과는 NaN 
		
		// System.out.println(5/0); 에러 예외가 발생된다.(java.lang.ArithmeticException)
		System.out.println(5 / 0.0); // Infinity 
		System.out.println(5 % 0.0); // NaN 
		
		// Java에서는 프로그램에서 /와 %연산의 결과가 Infinity or NaN인지 확인하기 위해서
		// WrapperClass중 Double의 isInfinite()와 isNaN()메서드를 사용한다.
		// 이 메서드들은 리턴되는 값이 Infinity or NaN이면 true를 리턴하고 아니면 false를 리턴한다.
		
		int x = 5;
		double y = 0.0;
		
		double d1 = x/y;
		double d2 = x%y;
		System.out.println(Double.isInfinite(d1));
		System.out.println(Double.isNaN(d1));
		System.out.println(Double.isInfinite(d2));
		System.out.println(Double.isNaN(d2));
		System.out.println();
		
		System.out.println(d1 + 2);
		System.out.println(d2 + 2);
		System.out.println();

		if(Double.isInfinite(d1) || Double.isNaN(d1)) {
			System.out.println("계산을 할 수가 없습니다!");
		}else{
			System.out.println(d1 + 2);
		}
	}
}
