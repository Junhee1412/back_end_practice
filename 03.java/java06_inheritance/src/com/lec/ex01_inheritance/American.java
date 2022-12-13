package com.lec.ex01_inheritance;

public class American extends Eve{
	@Override
	public String toString() {
		return "나는 미국 사람입니다! 나의 이름은 " + this.name + "입니다.";
	}
	
	@Override
	public void move() {
		System.out.println("화장품을 제조합니다!");
	}
	
	@Override
	public void speak() {
		System.out.println("영어로 말을 합니다!");
	}

}
