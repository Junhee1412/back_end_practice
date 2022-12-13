package com.robot.v4_interface;

import com.robot.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("===Robot V4.0(인터페이스)===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("Cheap", 5);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		
		cheapRobot.setFly(new FlyNo());
		cheapRobot.setMissile(new MissileNo());
		cheapRobot.setSword(new SwordNo());
		
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name+"Robot의 재고수량 = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardrobot = new StandardRobot("Standard", 10);
		standardrobot.shape();
		standardrobot.actionWalk();
		standardrobot.actionRun();
		
		standardrobot.setFly(new FlyNo());
		standardrobot.setMissile(new MissileYes());
		standardrobot.setSword(new SwordWood());
		
		standardrobot.actionFly();
		standardrobot.actionMissile();
		standardrobot.actionSword();
		System.out.println(standardrobot.name+"Robot의 재고수량 = " + standardrobot.qty);
		System.out.println();
		
		SuperRobot superrobot = new SuperRobot("Super", 5);
		superrobot.shape();
		superrobot.actionWalk();
		superrobot.actionRun();
		
		superrobot.setFly(new FlyYes());
		superrobot.setMissile(new MissileYes());
		superrobot.setSword(new SwordUltra());
		
		superrobot.actionFly();
		superrobot.actionMissile();
		superrobot.actionSword();
		System.out.println(superrobot.name+"Robot의 재고수량 = " + superrobot.qty);
		System.out.println();
		
		
		
	}

}
