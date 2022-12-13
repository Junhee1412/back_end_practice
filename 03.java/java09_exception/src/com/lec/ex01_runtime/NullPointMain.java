package com.lec.ex01_runtime;

/*
	예외(Exception)
	
	1. 일반예외(Exception)
	
	   컴파일예외라고도 한다. Java소스를 컴파일하는 과정에서 예외처리코드가 필요한지
	   여부를 검사하기 때문이다. 예외처리코더가 없을 경우 컴파일에러가 발생한다.
	
	2. 실행예외(Runtime Exception)
	
	   실행예외는 Java컴파일러가 예외를 체크하지 않기 때문에 개발자의 경험에 따라서
	   예외처리를 해야한다. 만약, 개발자가 실행예외에 대한 처리를 하는 코딩을 하지
	   않았을 경우 해당 예외가 발생한다면 프로그램은 그 즉시 종료가 된다.
	   
	   일반예외와 실행예외는 컴파일시에 처리하는지 안하는지의 차이일뿐 모두 예외처리가
	   필요하다. "Java에서는 예외를 클래스로 관리"한다.
	   
	   JVM은 프로그램을 실행하는 도중에 예외가 발생하면 해당 예외클래스로 객체를 생성한다.
	   그 후에 예외처리로직에서 예외객체를 사용할 수 있다.
	   
	   모든 예외클래스는 java.lang.Exception클래스를 상속받는다. 일반예외와 실행예외클래스를
	   구분하는 방법은 일반예외는 Exception을 상속받지만 실행예외는 java.lang.RuntimeException을
	   상속받는다.

*/

public class NullPointMain {

	public static void main(String[] args) {
		
		String data = null;
		//NullPointException예외는 객체참조가 없는 상태를 의미한다.
		//즉, 객체가 없는 상태에서 객체를 참조하려고 할 때 예외가 발생한다.
		System.out.println(data.toString());
		
		System.out.println("중요한 로직을 처리해야합니다!!");
	}

}
