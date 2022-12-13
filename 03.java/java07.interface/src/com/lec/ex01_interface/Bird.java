package com.lec.ex01_interface;

public class Bird implements Animal {

	@Override
	public void sound() {
		System.out.println("짹짹 소리를 낸다!");
	}

	@Override
	public void move() {
		System.out.println("하늘을 난다!!");
	}
}
