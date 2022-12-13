package com.lec.ex02_array;

public class ArrayMain2 {

	public static void main(String[] args) {
		
		// 2. new 연산자 : 배열의 선언과 초기화
		int scores[]; // 선언만 되어 있지 크기, 값 등은 선언이 되어 있지 않다.
		//System.out.println(scores[0]); // 에러 : 초기화 에러 값이 없어서
		scores = new int[] {90,95,88,90,89,100,99,78,66,55,88,99};
		
		int sum = 0;
		for(int i = 0; i<scores.length;i++) {
			sum+=scores[i];
		}
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + sum/scores.length);
		System.out.println();
		
		//3. 메서드를 사용해서 배열처리
		
		int tot = total(scores);
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + tot/scores.length);
		System.out.println();	
		
		//xxx(); // 에러 : static 메서드에서 static이 아닌 메서드를 호출할 수 없다.
		yyy(); //static이 있어서 호출가능.
	}

	//메서드 생성방법
	//public void 메서드명(){}
	//public 리턴타입 메서드명() { return type의 값}
	public static int total(int[] xxx) {
			
		int tot = 0;
		for(int i = 0; i<xxx.length; i++) {
			tot+=xxx[i];
		}
		return tot;
	}
	
	void xxx() {};
	static void yyy() {};
}