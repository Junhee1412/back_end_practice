package com.lec.ex99_practice;

public class HumanMain {

	public static void main(String[] args) {
		
		Human chinese = new Chinese();
		Human kor = new Korean();
		Human ame = new American();
		
		ame.speak();
		kor.speak();
		chinese.speak();
	}
}