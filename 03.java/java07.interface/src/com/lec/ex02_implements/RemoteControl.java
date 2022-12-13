package com.lec.ex02_implements;

public interface RemoteControl {

	int MIN_VOLUMN = 0;
	int MAX_VOLUMN = 10;
	
	void powerOn();
	void powerOff();
	void setVolumn(int num);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리!!");
		} else {
			System.out.println("무음해제");
		}
	}	
	
	static void changeBattery() {
		System.out.println("건전지를 교체합니다!");
	}
}
