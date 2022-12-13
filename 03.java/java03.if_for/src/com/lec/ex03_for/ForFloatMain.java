package com.lec.ex03_for;

public class ForFloatMain {

	public static void main(String[] args) {
		//for문을 사용할 때 초기화식에서 변수를 선언할 때
		//부동소수점타입(실수)를 사용하지 말 것
		for(float f=0.1f;f<=1.0;f+=0.1f) {
			System.out.println(f);
		}
		//상기결과는 9번만 실행이 된다. 0.1은 float타입으로 정확하게
		//표현할 수 없기 때문에 실제값 0.1보다 약간 큰 값을 처리된다.
	}
}