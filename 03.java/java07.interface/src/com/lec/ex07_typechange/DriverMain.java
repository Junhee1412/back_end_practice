package com.lec.ex07_typechange;

public class DriverMain {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();//자동형변환
		vehicle.run();
		//vehicle.checkfare();(X)
		System.out.println();
		
		Bus bus = (Bus) vehicle;//강제형변환
		bus.run();
		bus.checkFare();
	

	}

}
