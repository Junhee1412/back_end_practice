package com.lec.ex01_class;

public class HumanMain {

	public static void main(String[] args) {
		
		String str1 = new String("소향");
		String str2 = new String("소향");

		Human hong = new Human();		
		Human kim = new Human();		
		Human park = new Human();		
		
		Human adam = new Human();
		Human eve = new Human();
		
		//1. 속성(field)
		adam.name = "아담";
		adam.gender = "남자";
		adam.age = 10000;
		
		eve.name = "이브";
		eve.gender = "여자";
		eve.age = 9999;
		
		System.out.println(adam.name);
		System.out.println(adam.gender);
		System.out.println(adam.age);
		System.out.println();
		System.out.println(eve.name);
		System.out.println(eve.gender);
		System.out.println(eve.age);
		
		//2.생성자 : 기본생성자 vs 기본생성자외
		String spider = new String();
		System.out.println("spider = " + spider);
		
		String sohyang = new String("소향");
		System.out.println("sohyang = " + sohyang);
		
		Human sonny = new Human("손흥민");
		System.out.println("sonny = " + sonny.name);
		
		Human kangin = new Human("이강인","남자",21);
		System.out.println(kangin.name + kangin.gender + kangin.age);
		
		Human minjae = new Human("김민재","남자",26);
		System.out.println(minjae.name + minjae.gender + minjae.age);
		
		Human messy = new Human("메시", 10, "남자");
		System.out.println(messy.name + messy.gender + messy.age);
		
		//3. 메서드
		minjae.move(minjae.name);
		kangin.move();
		sonny.think();
		sonny.speak();
		messy.eat();
		
	}
}