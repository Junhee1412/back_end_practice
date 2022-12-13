package com.lec.ex07_polymorphism.pkg1;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver hong = new Driver();
		hong.drive();
		Vechicle vechicle = new Vechicle();
		hong.drive(vechicle);
		hong.drive(new Taxi());
		hong.drive(new Bus());

	}

}
