package com.lec.ex02_generic;

public class BoxMain {

	public static void main(String[] args) {
		Box<Apple> 과일상자 = new Box();//제네릭타입은 좌측에 해야함.
		과일상자.setObject(new Apple());
		Apple 사과 = 과일상자.getObject();
		System.out.println(사과);
		System.out.println(사과.getClass());
		
		Box<Hammer> 도구상자 = new Box();
		도구상자.setObject(new Hammer());
		Hammer 망치 = 도구상자.getObject();
		System.out.println(망치);
		System.out.println(망치.getClass());

		Box<String> 서류상자 = new Box();
		// 과일상자.setObject(new Hammer()); 과일상자에 해머 못들어감. Type이 다름.
		// 도구상자.setObject(new Apple()); 문법에러가 생겨버림. 컴파일 자체가 안됨. 
		// 제네릭타입은 엄격하게 제한함.
		
		// 제네릭은 컴파일 단계에서 에러발생을 미연에 방지하기 위해
		// 객체 저장시 특정객체만 제한하도록 하는 방법이다.
		// 주의사항
		// 좌변에만 제네릭을 정의하면 사전에 에러를 방지하지만
		// 우변에 제네릭을 정의하면 non generic과 동일하다.
		// 즉, 우변에만 제네릭을 정의할 경우에는 컴파일 에러는
		// 발생하지 않고 런타임시에 예외가 발생한다.
		Box toolBox = new Box<Apple>();
		toolBox.setObject(new Apple());
		Apple xxx = (Apple) toolBox.getObject();
		
		Box<String> yyy = new Box();
		Box<int[]> zzz = new Box();
	}

}

class Box<T> {
	private T t;

	public T getObject() {
		return t;
	}

	public void setObject(T t) {
		this.t = t;
	}
	
}

class Apple{
	@Override
	public String toString() {
		return "나는 사과입니다.";
	}
}
class Hammer{
	@Override
	public String toString() {
		return "나는 망치입니다.";
	}
}