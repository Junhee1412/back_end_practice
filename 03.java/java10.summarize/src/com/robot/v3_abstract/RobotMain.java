package com.robot.v3_abstract;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("===Robot V3.0(추상화)===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("Cheap", 5);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name+"Robot의 재고수량 = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot("Standard", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name+"Robot의 재고수량 = " + standardRobot.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot ("Super", 5);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name+"Robot의 재고수량 = " + superRobot.qty);
		System.out.println();
	}

}
