package com.lec.ex10_abstract.method;

public class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("야옹 소리를 낸다.");
	}

	@Override
	void move() {
		System.out.println("사뿐사뿐 움직인다");
	}
}
