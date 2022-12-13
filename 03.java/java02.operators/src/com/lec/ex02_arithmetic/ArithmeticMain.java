package com.lec.ex02_arithmetic;

/*
	산술연산자(+, -, /, *, %)
	
	Java에서 산술연산자는 4칙연산자와 나머지연산자(%) 총 5개의 연산자가 있다.
	이 연산자는 boolean타입을 제외한 모든 기본 타입에 사용할 수 있다.
	
	산술연산자의 특징은 피연산자의 데이터타입이 동일타입이 아닐 경우 피연산자들의
	타입을 일치 시킨 후에 연산을 수행한다. 타입을 일치시키는 경우 아래와 같은
	규칙을 가지고 연산을 수행한다.
	
	1. 피연산자들이 모두 정수타입이고, int타입보다 크기가 작을 경우 모두 int로
	타입을 변경한 후에 연산을 수행한다. 따라서, 연산결과의 타입은 int이다.
	
	2. 피연산자들이 모두 정수타입이고, long타입이 있을 경우 모두 long으로 변환후
	연산을 수행한다.
	
	int + long -> long + long = 결과는 long타입이다.
	
	3. 피연산자 중 실수타입(float, double)이 있을 경우 크기가 큰 실수 타입으로 변환 후
	연산을 수행한다.
	
	int + double = double + double = 결과는 double타입이다.
	
	간단하게 정리하면 long타입을 제외한 정수타입 연산은 int타입으로 산출되고 피연산자중
	하나라도 실수타입이 있다면 결과는 실수타입으로 산출된다.
	
	정수타입의 연산결과가 int타입으로 나오는 이유는 "JVM"이 기본적으로 32bit(4byte)단위로
	연산을 하기 때문이다.

*/
public class ArithmeticMain {

	public static void main(String[] args) {
		
		byte byte1 = 1;
		byte byte2 = 1;
		//byte result = byte1 + byte2; //형변환을 하지 않으면 에러
		int result1 = byte1 + byte2;
		System.out.println("result1 = " + result1);
		
		int int1 = 10;
		int int2 = 20;
		int result2 = int1 + int2; //정수타입의 연산은 기본으로 int타입으로 수행한다.
		System.out.println("result2 = " + result2);
		
		double result3 = int1 /int2; //값이 먼저 int로 나오는데 0.5를 int로 도출하면 0이어서 result3은 0.0으로 도출됨.
		System.out.println("result3 = " + result3);
		
		double result4 = (double) int1 / int2;
		System.out.println("result4 = " + result4);
		
		result4 = int1 * 1.0 / int2;
		System.out.println("result4 = " + result4);
		
		result4 = int1 / int2 * 1.0;
		System.out.println("result4 = " + result4);

	}
}
