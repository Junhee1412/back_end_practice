package com.lec.ex03_compare;

public class CompareOperatorMain1 {

	public static void main(String[] args) {
		//비교연산자 : <, >, <=, >=, !=
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1 == num2);
		boolean result = num1!=num2;
		System.out.println(result);
		System.out.println();
		
		char char1 = 'A';
		char char2 = 'B';
		
		result = char1<char2;
		System.out.println(result);
		
		//비교연산시에는 연산을 수행하기전에 형변환이 발생되어서
		//피연산자의 타입을 일치시킨다.
		System.out.println('A'==65);
		System.out.println(3==3.0);
		System.out.println();
		
		System.out.println(0.1==0.1f);//false
		//이진포맷기수를 사용하는 모든 부동소수점타입은 0.1을 정확히 표현할 수가
		//없기 때문에 true가 아니라 false로 결과값이 나온다.
		//0.1f는 0.1000000001490....로 값이 되어있음.
		System.out.println((double)0.1f);
	}
}