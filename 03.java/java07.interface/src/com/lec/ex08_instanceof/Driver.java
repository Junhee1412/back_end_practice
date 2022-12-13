package com.lec.ex08_instanceof;

public class Driver {
	void drive(Vehicle vehicle) {
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}else if(vehicle instanceof Taxi) {
			Taxi taxi = (Taxi) vehicle;
			taxi.run();
			taxi.xxx();
		}else {
			vehicle.run();
		}

	}
}
