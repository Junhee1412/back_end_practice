package com.lec.ex05_protected.pkg2;

import com.lec.ex05_protected.pkg1.B;

public class C {
	void method_c() {
		//A의 생성자의 접근제한자가 protected이기 때문에
		//다른 패키지에 있는 클래스가 상속관계가 없을 경우에는
		//접근할 수가 없다.
		//A a = new A();   //protected
		//a.field1 = "";
		//a.field2 = "";
		//a.method_a();
		B b1 = new B();
		//b b2 = new B(10); //default 생성자 다른패키지
		//b1.method_b(); //
		
	}
}
