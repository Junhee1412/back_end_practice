package com.lec.ex01_runtime;

public class ClassCastMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		changeDog(dog);
		changeDog(cat);
	}

	private static void changeDog(Animal animal) {
		Dog dog = (Dog) animal;
		System.out.println(dog);
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}