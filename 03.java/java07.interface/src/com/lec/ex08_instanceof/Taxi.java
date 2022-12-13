package com.lec.ex08_instanceof;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시를 운전합니다!");
	}
	
	public void xxx() {
		System.out.println("택시미터기를 조작합니다");
	}

}
