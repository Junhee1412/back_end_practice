package com.lec.ex07_typechange;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스를 운전합니다!");
	}
	public void checkFare() {
		System.out.println("버스요금을 확인합니다!");
	}
}
