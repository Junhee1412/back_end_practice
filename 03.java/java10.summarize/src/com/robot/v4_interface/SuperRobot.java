package com.robot.v4_interface;

import com.robot.inter.*;

public class SuperRobot extends Robot {

	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	
	public SuperRobot(String name, int qty) {
		super(name, qty);
	}
	
	

	public void setFly(InterFly fly) {
		this.fly = fly;
	}



	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}



	public void setSword(InterSword sword) {
		this.sword = sword;
	}



	@Override
	public void actionFly() {
		fly.fly();
	}

	@Override
	public void actionMissile() {
		missile.missile();
	}

	@Override
	public void actionSword() {
		sword.sword();
	}


}
