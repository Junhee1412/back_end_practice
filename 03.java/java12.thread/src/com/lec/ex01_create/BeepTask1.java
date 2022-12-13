package com.lec.ex01_create;

import java.awt.Toolkit;

public class BeepTask1 implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();//스피커지원
		for(int i =0; i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);//0.5초간 멈춰라
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
