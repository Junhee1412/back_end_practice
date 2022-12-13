package com.lec.ex17_access._class.pkg1;

/*
	class의 접근제한자는 public과 default가 있다.
	class에 정의된 제한자가 아무것도 선언되어 있지 않다면
	default 접근제한자로 선언된 것이다.
	A클래스는 public으로 선언되었기 때문에 다른 패키지에서
	접근할 수 있지만 B클래스는 default로 선언되어서 다른
	패키지에서는 접근할 수가 없다.
*/
public class A {
	B b;
}
