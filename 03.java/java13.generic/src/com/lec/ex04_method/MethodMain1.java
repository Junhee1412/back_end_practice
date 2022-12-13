package com.lec.ex04_method;

public class MethodMain1 {

	public static void main(String[] args) {
		//1. 제네릭메서드
		Box<Integer> box_1 = Util.boxing(1000);
		int val_1 = box_1.get();
		System.out.println(val_1);
		
		Box<String> box_2 = Util.boxing("문자열");
		String val_2 = box_2.get();
		System.out.println(val_2);
		
		Box<Robot> box_3 = Util.boxing(new Robot());
		Robot val_3 = box_3.get();
		System.out.println(val_3);
		
		//2. 일반메서드
		//Box 도구상자 = Util.method("망치");
		//Box 도구상자 = Util.method(new Car());
		Box 도구상자 = Util.method(new Robot());
		System.out.println(도구상자.get());
	}

}

class Box<T>{
	private T t;
	public T get() {return t;}
	public void set(T t) {this.t = t;}
}

class Util{
	
	//1. 일반메서드
	public static Box method(Robot robot) {
		Box box = new Box();
		box.set(new String("망치"));
		box.set(new Robot());
		return box;
	}
	
	//2. 제네릭메서드
	public static <T> Box<T> boxing(T t) {
		Box box = new Box();
		box.set(t);
		return box;
	}
}

class Robot{
	@Override
	public String toString() {
		return "나는 로봇입니다!";
	}
}


class Apple{
	@Override
	public String toString() {
		return "나는 사과입니다!";
	}
}

class Car{
	@Override
	public String toString() {
		return "나는 자동차입니다!";
	}
}