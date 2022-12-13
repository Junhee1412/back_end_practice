package com.lec.ex08_instanceof;

public class DriverMain {

	public static void main(String[] args) {
		Driver hong = new Driver();
		//hong.drive(new Bus());
		//System.out.println();
		hong.drive(new Taxi());
		hong.drive(new Bus());
		hong.drive(new 오토바이());
	}
}

class 오토바이 implements Vehicle{

	@Override
	public void run() {
		System.out.println("오토바이를 탑니다!!");
	}
	
}