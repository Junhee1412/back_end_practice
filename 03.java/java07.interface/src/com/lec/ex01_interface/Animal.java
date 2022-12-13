package com.lec.ex01_interface;

public interface Animal {

	// public static final String KIND = "동물";
	// 생략해도 자동으로 컴파일과정에서 추가된다. public static final 
	String KIND = "동물"; 
	public abstract void sound();
	// public abstract을 생략해도 자동으로 추가된다
	void move();
	
	// interface의 메서드는 모두 추상메서드이기 때문에
	// 실행블럭을 가질수가 없다.
	// void breath() { System.out.println( "숨을 쉰다!!");}
}
