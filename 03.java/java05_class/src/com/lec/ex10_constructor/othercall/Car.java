package com.lec.ex10_constructor.othercall;

public class Car {

	// 필드
	String company="현대";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	/* this는 객체 자기자신을 가르키는 예약어. 생성자에서 다른 생성자를 호출할 경우 this()
	시그니처에 맞는 생성자를 호출 */
	Car(){
		// this(); // 자기자신에서 자기를 호출 > 에러
		this(null,null,0);
	}

	Car(String model){
		this(model, null,0);
	}

	Car(String model, String color){
		this(model, color,0);
	}

	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}
	
}
