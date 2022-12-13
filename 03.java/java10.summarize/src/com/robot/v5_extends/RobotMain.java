package com.robot.v5_extends;

import com.robot.impl.*;

public class RobotMain {
	public static void main(String[] args) {
		System.out.println("===Robot V5.0(인터페이스 상속)===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("Cheap", 5);
		
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		
		robot.setFly(new FlyNo());
		robot.setMissile(new MissileNo());
		robot.setSword(new SwordNo());
		
		robot.actionFly();
		robot.actionMissile();
		robot.actionSword();
		System.out.println(robot.name+"Robot의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new StandardRobot("Standard", 10);
		
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		
		robot.setFly(new FlyNo());
		robot.setMissile(new MissileYes());
		robot.setSword(new SwordWood());
		
		robot.actionFly();
		robot.actionMissile();
		robot.actionSword();
		System.out.println(robot.name+"Robot의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new SuperRobot("Super", 5);
		
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		
		robot.setFly(new FlyYes());
		robot.setMissile(new MissileYes());
		robot.setSword(new SwordUltra());
		
		robot.actionFly();
		robot.actionMissile();
		robot.actionSword();
		System.out.println(robot.name+"Robot의 재고수량 = " + robot.qty);
		System.out.println();
	}
}
