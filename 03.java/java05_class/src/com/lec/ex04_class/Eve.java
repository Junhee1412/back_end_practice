package com.lec.ex04_class;

public class Eve {
	String name = "이브";
	String gender = "여자";
	int age = 9000;
	
	void speak() {
		System.out.println("말을 한다!!!");
	}
	
	@Override
	public String toString() {
		return "Eve [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	String move() {
		return "음식을 만든다.";
	}
}
