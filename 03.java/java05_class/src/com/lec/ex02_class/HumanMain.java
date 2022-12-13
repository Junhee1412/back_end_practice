package com.lec.ex02_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human adam = new Human();
		adam.name = "아담";
		
		Car myCar = new Car();
		Phone myPhone = new Phone();
		Laptop myLaptop = new Laptop();
		
		Human sonny = new Human("손흥민","남자",31);
		System.out.println(sonny.name);
		System.out.println(sonny.gender);
		System.out.println(sonny.age);
		System.out.println();		
		
		System.out.println(sonny.toString());
		System.out.println(sonny.hashCode());
	}
}
