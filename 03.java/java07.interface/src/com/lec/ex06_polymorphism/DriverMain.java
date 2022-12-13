package com.lec.ex06_polymorphism;
/*
	1. 타입변환과 다형성
	
	   상속에서 타입변환과 다형성에 대해서 알아봤듯이 인터페이스에서도 다형성을 구현하는
	   기법이 사용된다. 객체지향언어에서는 상속보다는 인터페이스를 통해서 다형성을 구현하는
	   경우가 더 많다.
	   
	   다만, 차이점은 상속은 동일 타입의 자식클래스를 만드는 방법이고 인터페이스는 동일한
	   클래스를 만드는 방법이다. 둘다 다형성을 구현하는 방법에서는 동일한 개념이다.
	   
	2. 매개변수의 다형성
	
	   자동타입변환은 필드의 값을 대입할 때도 발생하지만 주로 메서드를 호출할 때 더 많이
	   발생한다. 매개값을 다양화하기 위해서는 상속에서는 매개변수를 부모클래스로 선언하고
	   호출할 때는 자식클래스를 대입(전달)했지만 인터페이스에서는 매개변수를 인터페이스타입으로
	   선언하고 메서드를 호출할 때 구현객체를 전달한다.

*/
public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		//hong.drive(new 탈것()); 인터페이스는 생성자가 없음.
		hong.drive(new Vehicle());
		hong.drive(new Taxi());
		hong.drive(new Bus());
		hong.drive(new 오토바이());
		hong.drive(new 자전거());
		hong.drive(new 퀵보드());
	}
}

class 오토바이 implements 탈것 {
	public void run() {
		System.out.println("오토바이를 탑니다");
	};
}
class 자전거 implements 탈것 {
	public void run() {
		System.out.println("자전거를 탑니다");
	};
}
class 퀵보드 implements 탈것 {
	public void run() {
		System.out.println("퀵보드를 탑니다");
	};
}
