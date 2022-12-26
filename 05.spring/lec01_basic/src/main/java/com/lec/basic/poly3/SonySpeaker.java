package com.lec.basic.poly3;

import com.lec.basic.poly3.Speaker;

public class SonySpeaker implements Speaker{
	
	public SonySpeaker() {
		System.out.println("==> Sony Speaker 객체 생성!");
	}
	
	public void volumnUp() {
		System.out.println("==> Sony Speaker 볼륨 업!!");
	}
	
	public void volumnDown() {
		System.out.println("==> Sony Speaker 볼륨 다운!!");
	}
	
}
