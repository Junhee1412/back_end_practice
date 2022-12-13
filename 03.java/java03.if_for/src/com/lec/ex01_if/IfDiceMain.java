package com.lec.ex01_if;

public class IfDiceMain {

	public static void main(String[] args) {
		//실습 주사위던지기 : Math.random()
		//1~6까지 난수를 발생시키고 "1번이 나왔습니다~6번이 나왔습니다"
		//출력하는 로직 완성시키기
		
		int num=(int)(Math.random()*6)+1;
		
		System.out.println(num);
		
		if(num==1) {
			System.out.println("1번이 나왔습니다!");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다!");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다!");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다!");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다!");
		}else {
			System.out.println("6번이 나왔습니다!");
		}
	}
}