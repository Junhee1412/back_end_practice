package com.lec.ex10_constructor.field;

public class KoreanMain {

	public static void main(String[] args) {
		Korean hong = new Korean("길동이","201010-3124567");
		System.out.println(hong.toString()); // 길동이, 201010-3124567
		System.out.println(hong.age); // 1
		System.out.println(hong.result); // 30
		System.out.println(hong.add(100, 50)); // 150
		System.out.println(hong.result); // 150
	}

}
