package com.lec.ex02_implements;

public class RemoteControlMain {

	public static void main(String[] args) {
		
		// Audio audio = new Audio();
		// Television tv = new Television();
		
		RemoteControl rc;
		rc = new Television();
		rc.powerOn();
		rc.setVolumn(5);
		rc.powerOff();
		System.out.println();		
		
		rc = new Audio();
		rc.powerOn();
		rc.setVolumn(5);
		rc.powerOff();
		System.out.println();
	}

}
