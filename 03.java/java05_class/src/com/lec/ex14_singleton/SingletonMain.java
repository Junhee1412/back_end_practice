package com.lec.ex14_singleton;

import java.util.Calendar;

/*
  	싱글톤패턴(Singleton pattern)
  	
  	프로그램에서 단 한 개의 객체만 생성되도록 해야하는 경우가 있는데
  	객체가 단 한개만 생성된다고 해서 이러한 디자인패턴을 Singleton 패턴
  	이라고 한다.
  	
  	싱글톤객체를 만드는 방법
  	
  	1. 외부에서 new 객체생성연산자로 생성자를 호출할 수 없도록 막아야한다.
  	   그 이유는 생성자를 호출한 만큼 무제한으로 객체가 생성되기 때문이다.
  	   생성자를 외부에서 호출할 수 없도록 하려면 생성자에 접근을 하지
  	   못하도록 private접근제한자로 선언하는 것이다.
  	   
  	2. 자신의 타입인 정적필드를 선언하고 자신의 객체를 생성해서 초기화 한 후
  	   내부에서 new연산자로 객체를 생성하고 이 객체를 공통으로 사용하기 위해서
  	   정적(static)필드로 선언하고 이 객체를 외부에서 접근하지 못하도록
  	   private접근제한자로 선언한다.
  	   
  	3. 새롭게 생성된 singleton객체를 외부에서 접근하는 메서드를 작성하고
  	   그 메서드에서 Singleton참조타입을 리턴하도록 한다. 일반적으로 객체를
  	   리턴하는 메서드이름은 getInstance()로 정의한다.
  	   
 */



public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		Singleton sing3 = Singleton.getInstance();
		Singleton sing4 = Singleton.getInstance();
		
		System.out.println(sing1.hashCode());
		System.out.println(sing2.hashCode());
		System.out.println(sing3.hashCode());
		System.out.println(sing4.hashCode());
		
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		System.out.println(cal1.hashCode());
		System.out.println(cal2.hashCode());
	}

}


class Singleton{
	private Singleton() {}
	private static Singleton singleton = new Singleton();
	public static Singleton getInstance() {
		return singleton;
	}
}