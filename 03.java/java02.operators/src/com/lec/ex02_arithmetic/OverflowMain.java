package com.lec.ex02_arithmetic;

public class OverflowMain {

	public static void main(String[] args) {
		// 산술연산할 때 주의할 점은 연산결과가 데이터타입으로 충분히 표현가능한
		// 범위인지 여부를 확인해야 한다. 표현할 수 없는 값이 산출될 경우 overflow
		// 가 발생되고 그 결과값은 쓰레기값(엉뚱한 값)을 얻을 수가 있다.
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		
		// 상기와 같은 에러를 방지하기 위해서는 두 변수 중 하나는 long타입으로 선언
		// 되어야 하고 c의 데이터 타입도 long이 되어야 한다.
		long a = 1000000;
		long b = 1000000;
		long c = a*b;
		System.out.println(c);
		
		
	}

}
