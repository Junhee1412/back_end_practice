package com.lec.ex03_multi;

import com.lec.ex02_implements.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volumn;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다!");
	}

	@Override
	public void powerOn() {
		System.out.println("Smart TV를 파워온!!");
	}

	@Override
	public void powerOff() {
		System.out.println("Smart TV를 파워오프!!");
	}

	@Override
	public void setVolumn(int volumn) {
		if(volumn > RemoteControl.MAX_VOLUMN) {
			this.volumn = RemoteControl.MAX_VOLUMN;
		} else if(volumn < RemoteControl.MIN_VOLUMN) {
			this.volumn = RemoteControl.MIN_VOLUMN;
		}
		this.volumn = volumn;
		System.out.println("현재 Smart TV의 볼륨은 " + volumn + " 입니다!");
	}

}
