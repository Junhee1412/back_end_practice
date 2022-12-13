package com.lec.ex01_interface;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("야옹 소리를 낸다!!");
	}

	@Override
	public void move() {
		System.out.println("사뿐사뿐 움직인다!!");
	}

}
