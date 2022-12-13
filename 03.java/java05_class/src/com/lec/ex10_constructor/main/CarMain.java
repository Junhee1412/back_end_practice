package com.lec.ex10_constructor.main;

public class CarMain {

	public static void main(String[] args) {
		// 기본생성자 이외의 다른 생성자가 정의되어있다면 기본 생성자는 자동으로 추가되지 않기 때문에 기본생성자를 별도로 정의해야한다.
		Car car1=new Car();
		Car car2=new Car("분홍", 3000);
		Car car3=new Car(1000,"검정");
		Car car4=new Car("회색",1500,"벤츠");// 빨간줄 > Create 컨스트럭터~~ 클릭하면 Car.java에 생성.
	}
}
