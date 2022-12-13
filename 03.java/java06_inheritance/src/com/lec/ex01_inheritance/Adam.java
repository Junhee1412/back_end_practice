package com.lec.ex01_inheritance;

public class Adam extends Human{

	@Override
	public String toString() {
		return "Adam [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void move() {
		System.out.println(this.name + "이 사냥을 합니다!");
	}
}
