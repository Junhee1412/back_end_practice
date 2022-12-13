package com.lec.ex07_class;

public class American extends Human {
	void speak() {
		System.out.println("영어로 말을 합니다!");
	}

	@Override
	void move() {
		System.out.println("주식을 거래합니다.");
	}

	public String toString() {
		return this.name;
	}
}
