package com.lec.ex13_static;
/*
	정적멤버와 static
	
	정적(static)은 "고정"이라는 의미를 가지고 있다.
	정적멤버는 클래스에 고정된 멤버로서 객체의 생성과는 무관하게 사용할 수 있는 필드와 메서드를 말한다.
	
	이들을 각각 정적필드, 정적메서드라고 부른다.
	
	정적멤버는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 소속된 멤버이기 때문에 클래스멤버라고도 한다.
	
	정적필드와 정적메서드는 클래스에 고정된 멤버로서 ClassLoader가 클래스파일(~.class)을 메모리에 로딩할 때
	메서드(클래스)영역에 로딩을 해서 클래스별로 관리가 된다.
	
	필드를 선언할 때 인스턴스멤버로 선언할 것인지 아니면 클래스(정적)멤버로 선언할 것인지 판단은 
	각 객체에 고유하게 독립적으로 가지고 있어야 할 데이터라면 객체(인스턴스)멤버로 선언하고
	객체마다 가지고 있을 필요성이 없는 즉, 공통으로 사용할 데이터라면 정적멤버로 선언하는 것이 좋다.

*/
public class CaculatrorMain {
	public static void main(String[] args) {
		// Calculator.PI=1000; // 에러. PI는 상수이기 때문
		Calculator cal1=new Calculator();
		cal1.pi=100.0;
		
		Calculator.add(10, 10);
		cal1.mul(5, 2);
	}
}



class Calculator{
	// 정적필드는 상수로 선언하는 것이 일반적이다.
	static final double PI=3.141592; // 정적멤버이면서 상수.(상수라서 변수명을 대문자로 한다.)
	double pi= 3.14; // 객체멤버
	
	static int add(int x, int y){return x+y;} // 정적멤버
	int mul(int x, int y) {return x*y;} // 객체맴버
}