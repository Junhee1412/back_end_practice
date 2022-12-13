package com.lec.ex02_supercall;
/*
	부모생성자호출(super call)
	
	모든 객체는 클래스의 생성자를 호출해야만 생성할 수 있다. 부모객체도 예외는 아니다.
	Java문법은 부모객체를 생성하기 위해서는 자식생성자에서 부모생성자를 호출해야 한다.
	자식생성자에서 부모생성자를 호출할 경우에는 자식생성자의 맨 처음(첫 줄)에 선언되고
	호출해야 한다.
	
	부모생성자가 명시적으로 선언되지 않았다면 컴파일에러가 발생한다. 자식객체는 부모객체의
	생성자와 동일한 시그니처를 갖는 부모생성자를 호출한다. 만약, 매개값의 시그니처와 일치
	하는 부모생성자가 없을 경우에도 에러가 발생한다.
	
	super(매개값, ...)가 생략되면 Java컴파일러는 부모의 기본생성자 super()가 자동으로 추가
	되기 때문에 부모클래스에 기본생성자가 반드시 존재해야 한다.
	
	부모클래스에 기본생성자가 없고 일반생성자(매개값이 있는)가 있다면 자식생성자에서는
	반드시 부모생성자를 호출하기 위해서 동일 시그니처를 갖는 super(매개값...)생성자를
	명시적으로 선언 및 호출해야 한다. 그리고 반드시 부모생성자의 호출은 자식생성자의 맨
	처음에 위치해야 한다.

*/
public class Student extends People {
	
	public int studentNo;
	public Student() {
		super();
	}
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //People의(name, ssn)생성자 호출
		this.studentNo=studentNo;
	}
}
