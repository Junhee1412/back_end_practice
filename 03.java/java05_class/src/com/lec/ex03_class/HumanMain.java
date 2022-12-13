package com.lec.ex03_class;

public class HumanMain {

	public static void main(String[] args) {
		
		Human american = new Human("steve");
		Human korean = new Human("홍길동");
		
		System.out.println(american.name);
		System.out.println(korean.name);
		System.out.println();
		
		american.speak();
		korean.speak();
		System.out.println();
		
		american.speak("English");
		korean.speak("한글");
		System.out.println();
		
		korean.speak("Korean", 11);
		System.out.println(american.speak(11, "eeee"));

		String result = korean.speak(31,"영어");
		System.out.println(result);
	}

}
