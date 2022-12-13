package com.lec.ex06_class;

public class HumanMain {

	public static void main(String[] args) {
		//상속(2)
		Adam adam = new Adam();
		adam.name = "아담";
		adam.speak();
		adam.move();
		System.out.println(adam.toString());
		System.out.println();
		
		Eve eve = new Eve();
		eve.name = "이브";
		eve.speak();
		eve.move();
		System.out.println(eve.toString());
		System.out.println();
		
		Korean kor = new Korean();
		kor.name = "홍길동";
		kor.gender = "남자";
		kor.age =1000;
		kor.speak();
		kor.move();
		System.out.println(kor.toString());
		System.out.println();
		
		American usa = new American();
		usa.name = "에스더";
		usa.gender = "여자";
		usa.age =28;
		usa.speak();
		usa.move();
		System.out.println(usa.toString());
		System.out.println();
		
		
	}
}
