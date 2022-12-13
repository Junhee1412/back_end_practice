package com.lec.ex05_class;

public class HumanMain {

	public static void main(String[] args) {
		
		//상속(1)
		Adam adam = new Adam();
		System.out.println(adam.nation);
		adam.name = "아담";
		adam.speak();
		adam.move();
		System.out.println();
		
		Eve eve = new Eve();
		System.out.println(eve.nation);
		eve.name = "이브";
		eve.speak();
		eve.move();
		
	}

}
