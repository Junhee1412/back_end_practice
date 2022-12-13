package com.lec.ex04_while;

import java.io.IOException;
import java.util.Scanner;

public class DoWhileMain {

	public static void main(String[] args) throws IOException {
		//키보드로 부터 문자열을 입력받는 방법중에 System.in.read()
		//한개의 키코드만 읽기 때문에 콘솔에 입력된 문자열을 한꺼번에
		//읽을수가 없는 단점이 있다.
		System.out.print("키보드를 입력하세요 ==> ");
		System.out.println(System.in.read());
		
		//콘솔에 입력된 문자열을 한꺼번에 읽기 위해서는 Scanner라는 객체를
		//생성하고 nextLine()메서드를 호출하면 콘솔에 입력된 문자열을 한 번에
		//읽을 수가 있다.
		
		System.out.println("이름을 입력하세요!!");
		System.out.println("프로그램을 중단하려면 q를 입력하세요!!");

		//java.lang에 있는 함수 제외 java.util에 있는 Scanner를 사용하기 위해서는 위에서 import 시켜줘야함.
		Scanner scanner = new Scanner(System.in);
		String name = null;
		
		do {
			System.out.println(" ==> ");
			name = scanner.nextLine();
			System.out.println("입력된 이름 = " + name);
		}while(!name.contentEquals("q"));
		System.out.println();
		System.out.println("프로그램종료!!");
	}
}