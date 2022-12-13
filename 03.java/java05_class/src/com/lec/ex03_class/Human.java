package com.lec.ex03_class;

public class Human {
	
	//1.속성(필드)
	String name;
	
	//2.생성자
	public Human() {}
	public Human(String name) {
		this.name=name;
	}
	
	//3.메서드 - overloading
	void speak() {
		System.out.println("말을 합니다.");
	}
	void speak(String lang){
		System.out.println(lang + "로 말을 합니다.");
	}
	void speak(String lang, int age) {
		System.out.println(lang + "로 말을 합니다! 나이는 "+age+"살 입니다.");
	}
	String speak(int age, String lang) {
		String msg = lang + "로 말을 합니다! 나이는 "+age+"살 입니다.2";
		return "msg = " + msg;
	}

}