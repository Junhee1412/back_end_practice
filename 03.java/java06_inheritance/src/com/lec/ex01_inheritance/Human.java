package com.lec.ex01_inheritance;

public class Human {

	String name;
	String gender;
	int age;
	
	public void speak() {
		System.out.println("천국말을 합니다!");
	}
	
	public void eat() {
		System.out.println("음식을 먹습니다!");
	}
	
	public void move() {
		System.out.println("움직입니다!");
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	

}
