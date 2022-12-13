package com.lec.ex10_abstract.method;

public class Bird extends Animal{
@Override
void sound() {
	System.out.println("째액째액 소리를 낸다.");
}

@Override
void move() {
	System.out.println("하늘을 난다");
}
}
