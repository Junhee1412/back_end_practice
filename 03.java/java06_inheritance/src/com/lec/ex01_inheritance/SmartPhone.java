package com.lec.ex01_inheritance;

public class SmartPhone extends Phone {

	String url;
	
	public SmartPhone(String model, String color, String url) {
		super(model, color);
		this.url=url;
	}

}
