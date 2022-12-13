package com.lec.ex01_interface;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍 소리를 낸다!!");
	}

	@Override
	public void move() {
		System.out.println("껑충껑충 움직인다!!");
	}

}
