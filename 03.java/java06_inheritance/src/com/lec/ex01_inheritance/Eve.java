package com.lec.ex01_inheritance;

public class Eve extends Human {

	String bag = "샤넬백";
	String cloth = "입생롤랑";
	
	@Override
	public String toString() {
		return "내 이름은 "+ this.name + " 입니다!" 
				+ this.bag + ", " + this.cloth + "을(를) 좋아합니다!";
	}
	
	@Override
	public void move() {
		System.out.println(this.name + "이(가) 요리를 합니다!");
	}
	
	public void makeBaby() {
		System.out.println("아기를 갖습니다!!");
	}
}
