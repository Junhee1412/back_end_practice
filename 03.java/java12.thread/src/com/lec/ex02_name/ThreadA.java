package com.lec.ex02_name;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
