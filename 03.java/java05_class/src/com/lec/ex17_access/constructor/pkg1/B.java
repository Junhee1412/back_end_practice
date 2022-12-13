package com.lec.ex17_access.constructor.pkg1;

public class B {
	
	A a1 = new A(false);   //public
	A a2 = new A(1.0);     //protected 같은 패키지 접근가능
	A a3 = new A(1);       //default   같은 패키지 접근가능
	//A a4 = new A("A";)   //private   같은 객체만 접근가능
}
