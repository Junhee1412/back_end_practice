package com.lec.ex01_interface;

public class AnimalMain {

	public static void main(String[] args) {
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Bird());
		animalSound(new 호랑이());	
		animalSound(new 사자());
	}

	public static void animalSound(Animal animal) {
		animal.sound();		
	}
}

class 사자 implements Animal {

	@Override
	public void sound() {
		System.out.println("사자가 어흥소리를 낸다!");
	}

	@Override
	public void move() {
		System.out.println("사자가 어슬렁 어슬렁 움직인다!");
	}

}

class 호랑이 implements Animal {

	@Override
	public void sound() {
		System.out.println("호랑이가 어흥소리를 낸다!");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 어슬렁 어슬렁 움직인다!");		
	}
	
}