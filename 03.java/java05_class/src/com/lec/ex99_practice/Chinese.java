package com.lec.ex99_practice;

public class Chinese extends Human {
	
	String lang = "중어";
	
	@Override
	void speak() {
		System.out.println(lang + "말을 합니다!");
	}
	
}
