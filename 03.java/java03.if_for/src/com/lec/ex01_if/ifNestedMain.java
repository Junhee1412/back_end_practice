package com.lec.ex01_if;

public class ifNestedMain {

	public static void main(String[] args) {
		//난수를 81~100사이의 난수를 발생시키기
		System.out.println(Math.random()); //0<=x<1사이의 double타입의 숫자 한개를 리턴
		System.out.println((int)(Math.random()*20)+81);//81~100에서 계속 바뀌는 정수
		
		int score = (int)(Math.random()*20) + 81;
		//중첩 if
		//1. >= 90 : >=95 -> 'A+' else 'A0'
		//2. >= 80 : >=85 -> 'B+' else 'B0'
		if(score>=90) {
			if(score>=95) {
				System.out.println("A+ 학점입니다!");
			} else {
				System.out.println("A0 학점입니다.");
			}
		} else {
			if(score>=80) {
				System.out.println("B+ 학점입니다!");
			} else {
				System.out.println("B0 학점입니다!");
			}
		}
	}

}
