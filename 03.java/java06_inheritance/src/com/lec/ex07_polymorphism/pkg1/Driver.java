package com.lec.ex07_polymorphism.pkg1;

public class Driver {

	void drive() { System.out.println("차량을 운전할 수 있습니다!"); }
	void drive(Vechicle vechicle) { vechicle.run(); }
	void drive(Taxi taxi) {  taxi.run(); }
	void drive(Bus bus) {  bus.run(); }

}
