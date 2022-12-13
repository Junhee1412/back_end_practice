package com.lec.ex05_bounded;

/*
	제한된 파라미터(<T extends 상위타입>)
	
	타입파라미터에 지정되는 구체적인 데이터타입을 제한할 필요가 있을 경우, 예를 들어
	숫자를 연산하는 제네릭메서드가 있다면 이 메서드는 매개값을 숫자타입만 전달되어야 한다.
	즉, 매개값을 Number 또는 하위클래스인 (Byte, Integer, Double...)등의 객체만 전달되어야
	한다. 이것이 제한된 파라미터(Bounded Type Parameter)가 필요한 이유이다.
	
	제한된 파라미터를 선언하려면 타입파라미터 뒤에 extends키워드를 선언하고 상위타입을
	명시하면 된다. 상위 타입은 클래스 뿐만 아니라 인터페이스도 가능한데 인터페이스라고 해서
	implements로 선언하지 않고 클래스와 동일하게 extends로 선언한다.
	
	타입파라미터에 지정되는 구체적인 타입은 상위타입이거나 상위타입을 상속 또는 구현한
	하위클래스, 하위클래스만 전달이 가능하다.
*/
public class BoundedMain {

	public static void main(String[] args) {
		int result = 숫자비교.compare(10.5, 1);
		System.out.println(result);
		
		result = 숫자비교.compare(10f, 10.5);
		System.out.println(result);
		
		result = 숫자비교.compare(15f, 15D);
		System.out.println(result);
		
		//Number와 하위타입만 대입하도록 제한되어 있기 때문에 에러 발생
		//result = 숫자비교.compare("1", 1);
	}
}

class 숫자비교 {
	public static <T extends Number> int compare(T t1, T t2) {
		
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
}