package com.lec.ex02_access;

public class A {
	//필드
	int a_field1;
	static int a_field2;
	
	//생성자
	//메서드
	void a_method1() {};
	static void a_method2() {};
	
	// 1. 객체멤버중첩클래스 - 객체멤버 or 정적멤버 모두 접근가능
	class B{
		void b_method1() {
			a_field1 = 100;
			a_field2 = 200;
			a_method1();
			a_method2();
		};
	}
	// 2. 정적멤버중첩클래스 - 정적멤버만 접근가능
	static class C{
		void c_method1() {
			// a_field1 = 100; (x)
			a_field2 = 200;
			// a_method1();(x)
			a_method2();
		};
	}
}
