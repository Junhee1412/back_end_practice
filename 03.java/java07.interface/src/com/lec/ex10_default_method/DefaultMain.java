package com.lec.ex10_default_method;

public class DefaultMain {

	public static void main(String[] args) {
		MyInterface mia = new MyClassA();
		MyInterface mib = new MyClassB();
		
		mia.method1();
		mia.method2();
		mia.method3();
		System.out.println();
		
		mib.method1();
		mib.method2();
		mib.method3();

	}

}
