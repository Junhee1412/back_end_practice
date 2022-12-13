package com.lec.ex06_promotion.typechange;

public class PromotionMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동형변환
		// 1. 직접상속관계가 있다면 변환가능
		
		//자식 -> 부모
		a=b;
		a=c;
		//손자 -> 할아버지
		a=d;
		a=e;
		
		//자식 -> 부모
		b=d;
		c=e;
		
		// 2. 직접상속관계가 없다면 변환불가
		//b=e; 상속 불가능
		//c=d; 
		// 3. 메서드의 매개변수로 전달될 경우
		method_a(1.0);
		method_a("문자열");
		System.out.println();
		
		method_a(a);
		method_a(b);
		method_a(c);
		method_a(d);
		method_a(e);
		
	}
	
	static void method_a(double x) {System.out.println("정수형");}
	static void method_a(String x) {System.out.println("문자열");}
//	static void method_a(A x) {System.out.println("A클래스");}
//	static void method_a(B x) {System.out.println("B클래스");}
//	static void method_a(C x) {System.out.println("C클래스");}
//	static void method_a(D x) {System.out.println("D클래스");}
//	static void method_a(E x) {System.out.println("E클래스");}
	static void method_a(A x) {System.out.println("A클래스 = " + x.getClass());}
	static void method_a(B x) {System.out.println("B클래스 = " + x.getClass());}
	
}
