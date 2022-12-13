package com.lec.ex04_while;

import java.io.IOException;

public class WhileKeyControlMain {

	public static void main(String[] args) throws IOException {
		//System.in.read()메서드는 키보드 입력을 대기하고 있다가
		//엔터키를 친 후에는 키보드의 ASCII값을 정수로 리턴한다.
		//ReturnKey=13, EnterKey =10, A=65, a=97, 0=48...값을 리턴
		
		//리모콘제어프로그램만들기
		boolean run = true;
		int keyCode = 0;
		int volume = 0;
		
		while(run) {
			
			if(keyCode !=13 && keyCode !=10) {
				System.out.println("----------------------------------");
				System.out.println("1. 볼륨업  2. 볼륨다운  3. 음소거");
				System.out.println("----------------------------------");
				System.out.println("1~3번까지 입력하세요 ==> ");
			}
			keyCode = System.in.read();
			if(keyCode ==49) {//1번키
				volume++;
				System.out.println("현재 볼륨은 "+ volume);
			}else if(keyCode==50){//2번키
				volume--;
				System.out.println("현재 볼륨은 " + volume);
			}else if(keyCode==51){//3번키
				run=false;
			}
		}
		System.out.println("프로그램이 종료가 되었습니다!");
	}
}
