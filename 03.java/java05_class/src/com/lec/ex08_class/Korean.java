package com.lec.ex08_class;

public class Korean implements Human{

	@Override
	public void speak(String lang) {
		System.out.println(lang + "로 말을 합니다!");
	}
	@Override
	public void move() {
		System.out.println("프로그램을 개발합니다!");
	}
	@Override
	public void think() {
		System.out.println("사단칠정론을 논합니다!");
	}

}
