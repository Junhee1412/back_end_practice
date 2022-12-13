package com.lec.ex02_switch;

public class SwitchMain {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		//case 문을 사용할 때는 break를 사용해서 끊어줘야함. 안그러면 1번이나올때
		//case : 6번까지 다나와버림 마지막은 default로 줘도 됨.
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다!");
			break;
		case 2:
			System.out.println("2번이 나왔습니다!");
			break;
		case 3:
			System.out.println("3번이 나왔습니다!");
			break;
		case 4:
			System.out.println("4번이 나왔습니다!");
			break;
		case 5:
			System.out.println("5번이 나왔습니다!");
			break;
		default:
			System.out.println("6번이 나왔습니다!");
		}
	}
}