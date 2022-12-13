package com.lec.ex07_polymorphism.pkg2;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		hong.drive(new 탈것());
		hong.drive(new Vechicle());
		hong.drive(new Bus());
		hong.drive(new BiCycle());
		hong.drive(new 오토바이());
		hong.drive(new 비행기());
		hong.drive(new 요트());
	}

}

class BiCycle extends 탈것 { 
	@Override
	void run() {
		System.out.println("자전거를 탑니다!");
	}
}

class 오토바이 extends 탈것 {
	@Override
	void run() {
		System.out.println("오토바이를 운전합니다!");
	}
}

class 비행기 extends 탈것 {
	@Override
	void run() {
		System.out.println("비행기를 운전합니다!");
	}
}

class 요트 extends 탈것 {
	@Override
	void run() {
		System.out.println("요트를 운전합니다!");
	}
}
