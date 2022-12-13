package com.lec.ex01_object.ex05_finalize;

/*
	객체소멸자(finalize())
	
	참조하지 않는 배열이나 객체는 GC(Garbage Collector)가 힙영역에서 자동적으로
	소멸시킨다. GC는 객체를 소멸하기 직전에 마지막으로 객체의 소멸자(finalize())를
	실행시킨다. 소멸자는 Object.finalize()메서드를 말하는데 기본적으로 실행할
	내용이 없다.(즉, 실행블럭에는 아무런 내용이없다.)
	
	만약, 객체가 소멸되기 전에 마지막으로 사용했던 자원(데이터베이스 연결, 파일등)
	을 닫고 싶거나 중요한 데이터를 저장하고 싶다면 Object.finalize()를 재정의할 수가
	있다.
*/
public class Counter {
	
	private int no;
	
	//생성자
	public Counter(int no) {
		this.no = no;
	}
	
	//소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행되었습니다!!");
	}
}
