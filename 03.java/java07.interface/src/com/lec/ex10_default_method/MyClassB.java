package com.lec.ex10_default_method;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB.method1()호출!!!");
	}
	@Override
	public void method3() {
		System.out.println("3년뒤에 새로운 기능이 추가되었습니다!");
	}
}
