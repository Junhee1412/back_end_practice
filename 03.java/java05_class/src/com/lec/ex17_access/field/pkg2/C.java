package com.lec.ex17_access.field.pkg2;

import com.lec.ex17_access.field.pkg1.A;

public class C {
	
	public C() {
		A a = new A();
		
		//필드
		a.field1=10; // public
		// a.field2 = 10; // default 다른 패키지도 접근불가
		// a.field3 = 10; private 접근 불가 
		
		//메서드
		a.method1(); //public
		//a.method2();//default 다른 패키지도 접근불가
		//a.method3();//private 접근불가
		
	}

}
