package com.lec.ex11_default_extends;

public interface ChildInterface2 extends ParentInterface{
	
	@Override
	default void method2() {/*실행블럭*/}
	void method3();
}
