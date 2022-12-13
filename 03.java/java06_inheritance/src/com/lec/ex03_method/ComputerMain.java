package com.lec.ex03_method;

/*
	메서드재정의(@Override)
	
	부모클래스의 모든 메서드가 자식 클래스에 맞게 설계되어 있다면 가장 이상적인 상속이지만
	어떤 메서드는 자식클래스가 사용하기에는 적합하지 않을 경우도 있다. 이런 경우에 상속된
	일부 메서드는 자식클래스에서 다시 수정해서 사용해야 한다. Java 이런경우를 위해서 메서드
	오버라이드 기능을 제공한다.
	
	메서드 오버라이드는 상속된 메서드의 내용이 자식 클래스에 맞지 않을 경우 또는 자식 클래스에서
	필요한 기능이 있을 경우에 자식 클래스에서 부모 클래스의 메서드 이름과 동일한 시그니처를 갖는
	메서드를 재정의하는 것을 말한다.
	
	부모메서드가 오버라이드 되어 있다면 부모객체의 메서드는 숨겨지기 때문에 자식객체에서 메서드를
	호출하면 오버라이드된 자식 객체의 메서드가 호출된다.
	
	메서드를 오버라이드할 경우에는 아래와 같은 규칙에 의거해서 작성해야 한다.
	
	1. 부모메서드와 동일한 시그니처(리턴타입, 메서드이름, 매개변수목록)를 가져야한다.
	2. 접근제한을 부모객체보다 강하게 정의할 수 없다.
	3. 새로운 예외(Exception)를 떠넘길 수 없다.(throws)
	
*/
public class ComputerMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double result = cal.areaCircle(10);
		System.out.println("원의 넓이 = "+result);
		
		Computer com = new Computer();
		result = com.areaCircle(10);
		System.out.println("원의 넓이 = "+result);
	}

}
