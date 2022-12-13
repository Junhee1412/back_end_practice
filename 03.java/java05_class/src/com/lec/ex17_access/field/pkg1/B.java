package com.lec.ex17_access.field.pkg1;

public class B {
	public B() {
		
		A a = new A();
		
		//필드
		a.field1 = 10; // public
		a.field2 = 10; // default
		// a.field3 = 10; private 접근 불가 
		
		//메서드
		a.method1();//public
		a.method2();//default
		//a.method3();//private 접근불가
	}
}
