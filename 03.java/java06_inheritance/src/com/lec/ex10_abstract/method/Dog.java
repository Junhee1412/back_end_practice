package com.lec.ex10_abstract.method;

public class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("멍멍 소리를 낸다.");
	}

	@Override
	void move() {
		System.out.println("성큼성큼 움직인다!");
	}
}
