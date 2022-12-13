package com.robot.impl;

import com.robot.inter.InterMissile;

public class MissileYes implements InterMissile {

	@Override
	public void missile() {
		System.out.println("미사일을 쏠 수 있습니다!!");
	}

}
