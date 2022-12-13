package com.robot.v3_abstract;

public class CheapRobot extends Robot {
	
	public CheapRobot(String name, int qty) {
		super(name, qty);
	}

	@Override
	public void actionFly() {
		System.out.println("날 수가 없습니다.");
	}

	@Override
	public void actionMissile() {
		System.out.println("미사일을 쏠 수가 없습니다!");
		}
	@Override
	public void actionSword() {
		System.out.println("검이 없습니다!");
	}
}
