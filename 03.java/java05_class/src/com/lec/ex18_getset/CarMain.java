package com.lec.ex18_getset;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		//car.speed = 900;
		//car.stop = true;
		
		car.스피드(1000);
		// System.out.println("현재 자동차의 스피드 = " + car.toString());
		//System.out.println("현재 자동차의 스피드 = " + car.speed);
		System.out.println("현재 자동차의 스피드 = " + car.현재속도()); //getter
		
	}

}
