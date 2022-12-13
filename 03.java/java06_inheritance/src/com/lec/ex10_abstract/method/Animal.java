package com.lec.ex10_abstract.method;

public abstract class Animal {
	
	public String kind;
	void breath() {System.out.println("숨을 쉰다!!");}
	//void sound() {System.out.println("소리를 낸다!!");}
	abstract void sound();
	abstract void move();//추상메서드는 추상클래스에서 가능
	// 상속받은 클래스에서는 move를 강제적으로 재정의해야함.
}
