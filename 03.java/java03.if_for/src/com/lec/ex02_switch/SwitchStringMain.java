package com.lec.ex02_switch;

public class SwitchStringMain {

	public static void main(String[] args) {
		// Java6까지는 switch(조건)의 조건에는 정수타입(byte~long)만 가능했지만
		// 이후버전부터는 문자열(String)도 가능하게 되었다.
		
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("보너스는 100만원 지급!!");
			break;
		case "과장" :
			System.out.println("보너스는 150만원 지급!!");
			break;
		default:
			System.out.println("보너스는 200만원 지급!!");	
		}
	}
}
