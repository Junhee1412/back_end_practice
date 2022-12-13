package com.lec.ex05_protected.pkg1;

public class B {
	public B() {} //기본생성자
	B(int xxx) {} //default 생성자
	
	void method_b() {//default메서드
		A a = new A();        //protected
		a.field1= "문자열";   //public
		//a.field2= "문자열"  //private(x)
		a.method_a();         //protected
		
	}
}
