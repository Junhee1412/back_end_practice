package com.lec.basic.poly3;

import com.lec.basic.poly.TV;
import com.lec.basic.poly3.SonySpeaker;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	// 생성자인젝션이용하기
	// XML설정파일에 등록된 클래스로 객체를 생성할 때는 기본생성자를 호출한다.
	// 하지만 컨테이너가 매개변수를 가지는 생성자를 호출할 수 있도록 설정할
	// 수 있다. 생성자인젝션을 이용하면 생성자의 매개변수로 의존관계에 있는
	// 객체를 주입할 수 있다.
	
	public SamsungTV() { System.out.println("==>1. SamsungTV() 기본생성자호출");}
	public SamsungTV(Speaker speaker) { 
		System.out.println("==> 2. SamsungTV(speaker) 생성자호출");
		this.speaker = speaker;
	}
	public SamsungTV(Speaker speaker, int price) { 
		System.out.println("==> 3. SamsungTV(speaker, price) 생성자호출");
		this.speaker = speaker;
		this.price = price;
	}
		
	public void powerOn() { System.out.println("Samsung TV - powerOn!!"); }
	public void powerOff() { System.out.println("Samsung TV - powerff!!"); }
	public void volumnUp() { speaker.volumnUp(); }
	public void volumnDown() {  speaker.volumnDown(); }

}
