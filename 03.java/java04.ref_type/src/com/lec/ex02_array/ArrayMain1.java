package com.lec.ex02_array;

/*
	1. 배열이란?
	
		변수는 한개의 값만 저장할 수 있다. 하지만 저장할 데이터가 많아지면 그 수 만큼 변수가
		필요하게 된다. 이런 방법은 비효율적이고 번거로운 코딩이 된다. 동일타입의 많은 양의
		데이터를 사용할 경우에는 좀 더 효율적인 방법으로 데이터를 저장할 필요가 있는데
		이런 방법을 지원하는 것이 배열(Array)이다.

		Java에서는 배열은 동일 데이터타입의 데이터만 저장이 가능하고 연속적인 공간에 배치를
		시키고 각 데이터의 요소에 index를 부여해서 저장하는 자료구조이다.

	2. 배열의 선언방법
	
		배열의 선언방법은 2가지가 있다.
		
		1) 데이터타입[] 변수명; --> 이 방법이 관례이다.
		2) 데이터타입 변수명[]'
		
	3. 배열의 생성방법
	
		1) 값 목록으로 생성하는 방법
		
			int[] scores = {값1, ... 값n}; 와 같이 중괄호 {}안에 값의 항목(요소, element)을 갖는
			객체로 생성하는 방법
		
		2) new연산자로 생성하는 방법

			int[] scores = new int[5]; 와 같이 new연산자로 생성할 수 있다. new연산자로 생성된
			배열은 기본값으로, 참조타입은 null, 기본타입은 해당 타입별로 기본값으로 초기화되어
			저장되기 때문에 배열을 생성한 후에 값을 저장해야 한다.
			
			값이 저장되지 않은 배열(주로 참조타입인 경우)의 요소에 접근하려면 NullPointerException
			이 발생된다. 값을 저장하려면 scores[0] = 10;와 같이 대입연산자를 이용하여 해당 요소에
			값을 저장하게 된다.
	
	4. 배열의 제약사항

		1) 배열의 크기(길이 length)는 한 번 정의가 되면 변경할 수 없다. 즉, 고정이 된다.
		2) 동일타입의 데이터만 저장할 수 있다.
		3) 배열의 선언은 대괄호[]로 선언한다.
		4) 배열의 접근은 index로 접근한다.
		5) index는 0부터 시작한다.
			
*/

public class ArrayMain1 {

	private static int i;

	public static void main(String[] args) {
		
		// 1. 배열의 초기화 및 생성
		int[] scores = {90,95,88,90,89,100,99,78,66,55,88,99};
		
		// 1) 배열의 메모리 주소
		System.out.println(scores);            //메모리주소 : 16진수
		System.out.println(scores.hashCode()); //메모리주소 : 10진수
		System.out.println(scores.toString()); //메모리주소 : 문자열(16진수)
		System.out.println();
		
		// 2) index
		System.out.println("scores[0] = " + scores[0]);
		System.out.println("scores[1] = " + scores[1]);
		System.out.println("scores[5] = " + scores[5]);
		System.out.println();
		
		// 3) length
		System.out.println("score의 크기 = " + scores.length);
		//scores.length=20; //에러 : 배열의 length속성(필드)는 읽기전용
	
		//각 점수와 총점출력을 출력해보기
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
			sum += scores[i];
		}

		System.out.println();
		
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + sum/scores.length);
	}
}
