package com.lec.ex11_default_extends;

public interface ParentInterface {
	void method1();
	default void method2() {/* 실행블럭 */};
}
