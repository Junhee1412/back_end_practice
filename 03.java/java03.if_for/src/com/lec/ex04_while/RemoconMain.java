package com.lec.ex04_while;

import javax.swing.JOptionPane;

public class RemoconMain {

	public static void main(String[] args) {
		// do while : 리모콘 제어프로그램 만들기
		//JOptionPane으로 작성
		//실습 JOptionPan을 이용한 리모콘 제어프로그램 작성하기
		boolean run = true;
		int menu = 0;
		int volume = 0;
		String data;
		
		do {
			data = JOptionPane.showInputDialog("번호를 입력하세요!!\n\n" + 
					"1. 볼륨업 \n" + "2. 볼륨다운\n" + "3. 종료\n\n"+"1~3번까지 입력하세요!!");
			if(data==null) data ="0";
			if(data.equals("")) {
				menu = 0;
			}else {
				menu=Integer.parseInt(data);
				if(menu==1) {
					volume++;
				}else if(menu==2) {
					volume--;
				}else {
					volume=0;
				}
				System.out.println("현재 volume = " + volume);
			}
		} while(menu!=3);
		System.out.println("프로그램이 종료되었습니다!");
	}
}