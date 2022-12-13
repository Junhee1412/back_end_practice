package com.lec.ex04_class;

public class Adam {
	String name = "아담";
	String gender = "남자";
	int age = 10000;
	
	void speak() {
		System.out.println("말을 한다!!");
	}
	String move() {
		return "사냥을 한다";
	}
	@Override
	public String toString() {
		return "이름 = " + name + ", 성별 = " + gender + ", 나이 = " + age ;
	}
}
