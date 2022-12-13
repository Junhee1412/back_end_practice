package com.lec.ex05_field;

public class Car {
	Tire fl = new BigWidthTire();
	Tire fr = new BigWidthTire();
	Tire bl = new BigWidthTire();
	Tire br = new BigWidthTire();
	
	void run() {
		fl.roll();
		fr.roll();
		bl.roll();
		br.roll();
	}
	
}
