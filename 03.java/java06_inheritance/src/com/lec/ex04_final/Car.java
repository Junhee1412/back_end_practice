package com.lec.ex04_final;

public class Car {
	public int speed;
	public void speedUp() {
		speed +=1;
	}
	public final void stop() {speed =0;}//자식객체에서 재정의불가능한 메서드로 정의
}

class SuperCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
	}
//	public void stop() {
//		super.stop();
//	}
	//final로 정의된 부모메서드는 자식객체에서 재정의할 수 없다
}