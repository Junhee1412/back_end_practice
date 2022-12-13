package com.lec.ex02_implements;

public class Television implements RemoteControl{

	private int volumn;
	
	@Override
	public void powerOn() {
		System.out.println("TV Power On!!!");
	}

	@Override
	public void powerOff() {
		System.out.println("TV Power Off!!!");
	}

	@Override
	public void setVolumn(int volumn) {
		if (volumn >=RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}
		this.volumn = volumn;
		System.out.println("현재 TV볼륨은 = " + volumn + " 입니다!!");
	}

}
