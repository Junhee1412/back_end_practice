package com.robot.v6_method;

import com.robot.inter.*;

public class Robot {
	private InterFly fly;
	private InterMissile missile;
	private InterSword sword;
	
	public String name;
	public int qty;
	
	public Robot() {}
	public Robot(String name, int qty) {
		super();
		this.name = name;
		this.qty = qty;
	}
	public void shape() {System.out.println(this.name + "Robot입니다! 팔, 다리, 머리, 몸통이 있습니다!");}
	public void actionWalk() {System.out.println("걸을 수가 있습니다!");}
	public void actionRun() {System.out.println("달릴 수가 있습니다!");}
	
	public void setFly(InterFly fly) {
		this.fly = fly;
	}
	public void setMissile(InterMissile missile) {
		this.missile = missile;
	}
	public void setSword(InterSword sword) {
		this.sword = sword;
	}
	public void actionFly() {
		fly.fly();
	}

	public void actionMissile() {
		missile.missile();
	}
	public void actionSword() {
		sword.sword();
	}
}
