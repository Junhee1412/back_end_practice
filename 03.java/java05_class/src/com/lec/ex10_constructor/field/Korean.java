package com.lec.ex10_constructor.field;

public class Korean {

	// 필드
	String nation="한국";
	String name;
	String ssn;
	int age;
	
	int result;

	// 생성자
	public Korean(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.age=1;
		this.add(10, 20);
	}
	
	// 매서드
	int add(int x, int y) {
		this.result=x+y; // 여기서 this를 쓰는 정확한 이유가 뭐징? - 여기선 this가 없어도 상관없다. 
		return x+y; // 얘는 result에 리턴되는게 아니고 KoreanMain.에서 hong.add(100, 50) 이렇게 호출됫을때 저기로 리턴된다.
	}
	
	@Override
	public String toString() {
		return this.name+", "+this.ssn;
	}
	
}
