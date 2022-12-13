package com.lec.ex02_implements;

public class Audio implements RemoteControl{

	private int volumn;

	@Override
	public void powerOn() {
		System.out.println("Audio Power On!!!");
	}

	@Override
	public void powerOff() {
		System.out.println("Audio Power Off!!!");
	}

	@Override
	public void setVolumn(int volumn) {
		if (volumn >=RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if (volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}
		this.volumn = volumn;
		System.out.println("현재 오디오볼륨은 = " + volumn + " 입니다!!");
	}
}
