package com.lec.ex02_variables;

public class LiteralMain {

	public static void main(String[] args) {
		// 1.literal : 직접 입력된 값
		
		// 10진수
		int var1 = 10; // 10은 literal, var1은 변수
		System.out.println("10진수 = " + var1);
		
		// 8진수 : 숫자 맨 앞에 0으로 시작되는 리터럴
		int var2 = 010;
		System.out.println("8진수 = " + var2);
		
		// 16진수 : 숫자 맨 앞에 0x로 시작되는 리터럴
		int var3 = 0x10;
		System.out.println("16진수 = " + var3);
		
		// 2진수 : 숫자 맨 앞에 0b로 시작되는 리터럴
		int var4 =0b10;
		System.out.println("2진수 = " + var4);
		
		// 2. 서로 다른 데이터의 연산
		char chr1 = 'A'; // 내부적 65
		int int1 = 10;
		System.out.println("chr1 + int1 = " + (chr1 + int1));//75가 나옴. 괄호 안하면 A10나옴 연산시에는 큰 타입으로 자동형변환(char->int)됨.
		System.out.println("chr1 + int1 = " + (chr1 + (char)int1));//int타입을 char타입으로 강제 형변환 시킨다.
		System.out.println();
		
		double d1 = 10.0;
		int1 = 65;
		System.out.println("d1 + int1 = " + (d1 + int1));//자동형변환이 일어남.
		
		// 기본적으로 작은 크기의 타입과 큰 크기의 타입 연산 결과는 큰 데이터타입으로 자동형변환이 된 후에 연산이 된다.
		// 따라서 결과값을 저장하는 변수의 타입은 큰 크기의 타입으로 선언되어야 한다.
		double var5 = 10 + 10.0; // 자동형변환
		int var6 = (int) (10 + 10.0);// 강제형변환
	}
}