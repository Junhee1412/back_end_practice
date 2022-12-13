package com.lec.ex08_class;

public interface Human {

	// 1. 속성 - interface에서의 속성(필드)는 상수로 정의해야 한다.
	String nation = "";
	String name = "";
	String gender = "";
	int age = 0;
	
	//인터페이스는 상수이기 때문에 무조건 변경 불가 final을 선언 안해도 final임.
	
	// 2. 생성자 - interface는 생성자가 없다.
	
	// 3. 메서드 - 실행블럭이 없다. 즉, 모든 메서드는 전부 추상메서드다.
	void speak(String lang);
	void move();
	void think();
}
