package com.robot.v1_basic;

public class RobotMain {

	public static void main(String[] args) {
		
		System.out.println("===Robot V1.0(기본)");
		System.out.println();
		CheapRobot cheapRobot = new CheapRobot(5);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println("CheapRobot의 재고수량 = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot(10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println("StandardRobot의 재고수량 = " + standardRobot.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot(5);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println("SuperRobot의 재고수량 = " + superRobot.qty);
		System.out.println();
	}

}
