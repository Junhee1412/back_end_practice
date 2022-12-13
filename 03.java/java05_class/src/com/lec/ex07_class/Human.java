package com.lec.ex07_class;

public abstract class Human {
	String nation;
	String name;
	String gender;
	int age;
	
	abstract void speak();
	abstract void move();
	void think() {
		System.out.println("생각을 합니다!");
	}
}
