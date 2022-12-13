package com.lec.ex02_variables;

public class VariableMain3 {

	public static void main(String[] args) {
		// 참조타입(Reference Type)
		// String, Class, Array, Enum
		// String(문자열)은 참조타입, 정확히 이야기하면 String클래스타입
		// Java에서는 class로 선언된 모든 것은 참조타입이다.
		// Java에서 문자열을 표현할 때는 큰 따옴표로 선언해야 한다.
		// 작은 따옴표는 char타입을 선언할 때 사용한다.
		
		char c1 = 'A';
		// char c2 = "A"; // 에러 : char는 한개의 문자만 저장 가능 "A"는 문자열(String)이라는 참조타입
		String s1 = "A";
		String s2 = "AA";
		
		// 참조타입이란 객체가 저장되어 있는 주소를 참조한다고 해서 참조타입변수라고 한다.
		System.out.println(s1);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		// literal과 constant비교
		// Java에서는 상수변수의 이름은 관례로 모두 대문자로 선언, 단어마다 언더바(_)로 연결해서 선언한다.
		// 상수는 final로 선언된 변수를 의미한다. constan는 값이 한번 설정이 되면 수정할 수 없다.
		int val = 10;
		val = 20;

		final int val1 = 10; // 상수, 변수명이 관례에 어긋남.
		//val1 =20; // 에러 : 상수(constant, final 선언된 변수)는 값을 변경할 수 없다. 에러임.
		final int MIN_VALUE = 10;
		// MIN_VALUE = 20; 에러 : 값 변경불가
		final int MAX_VALUE;
		MAX_VALUE = 1000; // 초기화
		// MAX_VALUE = 2000; 에러 : 두번째 변경은 불가 오직 한번만 초기화할 수 있음.
	}
}
