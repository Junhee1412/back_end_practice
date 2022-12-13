package com.lec.ex01_inheritance;

public class Phone {
	//1. 필드
	String model;
	String color;
	
	//2. 생성자
	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	//3. 메서드
	void powerOn() {}
	void powerOff() {}
	
	@Override
	public String toString() {
		return this.model + ", " + this.color;
	}
}
