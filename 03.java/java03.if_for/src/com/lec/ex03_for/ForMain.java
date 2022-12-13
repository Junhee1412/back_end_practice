package com.lec.ex03_for;

public class ForMain {

	public static void main(String[] args) {
		for(int i = 0; i<=10;i++) {//i는 지역변수 즉, for문 안에서만 사용가능한 변수
			System.out.println(i+ ", ");
		}
		System.out.println();
		//1~100까지 합
		int sum = 0;
		int i =0;//전역변수
		for(i=0;i<=10;i++) {//i는 전역변수
			sum+=i;
		}
		System.out.println(sum);
	}
}