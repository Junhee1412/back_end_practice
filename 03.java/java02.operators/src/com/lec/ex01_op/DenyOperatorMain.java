package com.lec.ex01_op;

public class DenyOperatorMain {

	public static void main(String[] args) {
		// 논리부정연산자(!)는 true or false인 값을 부정하는 연산자이기 때문에
		// 피연산자가 boolean 타입일 경우에만 사용할 수 있다.
		// 논리부정연산자는 조건문이나 제어문에서 주로 사용된다.
		boolean isPlay = true;
		System.out.println("isPlay = " + isPlay);
		
		isPlay = !isPlay;
		System.out.println("isPlay = " + isPlay);
		
		int i1 = 10;
		// System.out.println("i1 = " + !i1); // !는 무조건 true false에만 사용할 수 있다.
		System.out.println("i1 = " + (i1 == 10));//true
		System.out.println("i1 = " + !(i1 == 10));//false
	}

}
