package com.lec.ex01_inheritance;

public class HumanMain {

	public static void main(String[] args) {
		
		Human human = new Human();
		System.out.println(human.toString());
		System.out.println();
		
		Adam adam = new Adam();
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		System.out.println(adam);
		adam.speak();
		adam.move();
		System.out.println();
		
		Eve eve = new Eve();
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 9000;
		System.out.println(eve);
		eve.speak();
		eve.move();
		eve.makeBaby();
		System.out.println();
		
		Korean kor = new Korean();
		kor.name = "홍길동";
		System.out.println(kor);
		kor.move();
		kor.speak();
		System.out.println();
		
		American usa = new American();
		usa.name = "에스더";
		System.out.println(usa);
		usa.move();
		usa.speak();
		

	}

}
