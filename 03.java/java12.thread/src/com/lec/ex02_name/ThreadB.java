package com.lec.ex02_name;

public class ThreadB extends Thread {
	public ThreadB() {
		}
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
