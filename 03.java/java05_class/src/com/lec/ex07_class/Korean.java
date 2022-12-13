package com.lec.ex07_class;

public class Korean extends Human {
	
	void speak() {
		System.out.println("한글로 말을 합니다!");
	}

	@Override
	void move() {
		System.out.println("프로그램을 개발합니다!");
	}
	@Override
	void think() {
		System.out.println("사단칠정론을 논의합니다.");
	}
}
