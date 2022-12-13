package com.lec.ex11_default_extends;

public interface ChildInterface3 extends ParentInterface{
	@Override
	void method2(); //부모의 default메서드를 추상메서드로 재선언
	void method3();
}
