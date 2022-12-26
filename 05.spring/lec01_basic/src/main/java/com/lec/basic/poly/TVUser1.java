package com.lec.basic.poly;

public class TVUser1 {
	
	public static void main(String[] args) {
		
		// c:/java.exe samsung(클래스이름변수)
		BeanFactory factory = new BeanFactory();
		
		TV tv = (TV) factory.getBean(args[0]);
		
		tv.powerOn();
		tv.powerOff();
		tv.volumnUp();
		tv.volumnDown();
	}
	
}
