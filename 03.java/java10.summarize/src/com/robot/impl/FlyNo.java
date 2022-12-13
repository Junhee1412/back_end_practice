package com.robot.impl;

import com.robot.inter.InterFly;

public class FlyNo implements InterFly{

	@Override
	public void fly() {
		System.out.println("날 수가 없습니다!!");
	}

}
