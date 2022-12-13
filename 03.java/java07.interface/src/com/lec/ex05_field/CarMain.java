package com.lec.ex05_field;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		//자동형변환
		
		myCar.fl = new SnowTire();
		myCar.fr = new SnowTire();
		myCar.bl = new SnowTire();
		myCar.br = new SnowTire();
		myCar.run();
		System.out.println();
		
		myCar.fl=new BigWidthTire();
		myCar.fr=new BigWidthTire();
		myCar.bl=new BigWidthTire();
		myCar.br=new BigWidthTire();
		myCar.run();
	}

}
