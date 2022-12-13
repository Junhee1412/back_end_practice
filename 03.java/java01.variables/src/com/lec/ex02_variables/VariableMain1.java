package com.lec.ex02_variables;

/*
	1. 변수란?
	
		프로그램의 작업을 처리하는 과정에서 필요에 따라 데이터를 메모리에 저장하게 되는데 이 때
		그 값을 저장하기 위해서 변수(Variable)를 선언한다. 이 변수는 하나의 값을 저장하는 메모리
		공간을 의미한다.
		
		변수라는 용어는 프로그램에서 수시로 값이 변동되면서 저자오딘 값이 변하기 때문에 변수라고
		명명이 되었다.
	
	2. 변수의 명명규칙
	
		1) 첫 번째 문자는 문자, $, _로 시작해야하고 숫자로 시작할 수 없다.(필수)
		2) 변수명은 대문자와 소문자가 구분이된다.(필수) firstName과 FirstName은 다른변수이다.
		3) 첫 번째 문자는 소문자로 시작하고 단어 구분마다 대문자로 선언한다. (Camel Case 방식)(관례)
		4) 변수명의 길이는 제한이 없다. 
		5) 한글명도 가능하다. 하지만 사용하지는 않는다. (관례)
		6) 자바예약어(if, for... 등등 예약어는 사용이 불가능하다.)는 사용할 수 없다.(필수)
	
	3. 변수의 사용
		
		변수에 값을 저장할 때 대입연산자(Assignment, =)를 사용한다. 수학에서는 동등비교이지만
		프로그램언어에서는 변수에 값을 대입하는 기능을 한다는 의미이다.
		
		변수를 선언하고 최초의 값을 저장하는 행위를 초기화하고 이 값을 초기값이라고 한다.
		자바에서 변수를 사용하기 위해서는 반드시 초기화가 되어야 사용할 수 있다.
		이 행위를 자바에서는 "변수의 초기화"라고 한다.
		
		리터럴(literal)과 상수(constant, 변하지 않는 값)는 같은 의미이지만 java에서는 literal을
		값을 변경할 수 없는 자료, 상수는 "한 번 값을 지정하면 변경할 수 없는 변수"로 정의하기 때문에
		Java에서는 literal과 constant를 구분해서 사용한다.
		
		final이라고 선언된 변수만 constant로 구분지어 사용한다.
		literal과 constant는 엄연히 다름.

*/


public class VariableMain1 {

	public static void main(String[] args) {
		//1. 변수 선언방법
		//   a. 데이터타입 변수명;       --> 선언만 한 행위
		//   b. 데이터타입 변수명 = 값;  --> 선언과 동시에 초기화 행위
		int firstNumber = 10;
		//int firstNumber = 20; // Java에서는 한번 선언된 변수는 재선언할 수가 없다. 같은이름 불가능
		int firstnumber = 20;   // Java에서는 변수명에 대소문자를 구분하기 때문에 가능 전혀 다른 변수임.
		int Firstnumber = 30;   // 에러는 아니나 변수명 명명규칙의 관례에 어긋난다.
		int 첫번째_숫자 = 40;    // 한글변수도 가능! 하지만 사용하지 않는다.
		
		System.out.println("firstNumber = " + firstNumber);//결과는 firstNumber = 10 뒤에 있는 변수가 "10"으로 자동형변환되어 나타난다.
		System.out.println("firstnumber = " + firstnumber);
		System.out.println("Firstnumber = " + Firstnumber);
		System.out.println("첫번째_숫자 = " + 첫번째_숫자);
		System.out.println();
		
		firstNumber = 20;
		//firstNumber = 20.0;//에러 : Java에서는 변수타입 즉, 정수와 실수는 다른 자료형이기 때문에 에러 
		//앞에 (int)를 이용하여 강제 형변환 가능 or 위에 변수타입을 더블을 사용하여 형변환 가능.
		
		//2. 변수의 선언
		int val1;		//선언만 하고 초기화 되지 않음.
		int val2 = 20;	//선언과 동시에 초기화
		
		//System.out.println("val1 = " + val1); //에러 : val1이 초기화되지 않음.
		System.out.println("val2 = " + val2);
		
		//val1 = val1 + 20; // 에러 : val1이 초기화되지 않음.
		val1 = 0;
		val1 = val1+20;
		val2 = val2+20;
		
		System.out.println("val1 = " + val1);
		System.out.println("val2 = " + val2);
		
		System.out.println();
		
		int val3 = val1 + val2;
		System.out.println("val3 = " + val3);
	}
}
