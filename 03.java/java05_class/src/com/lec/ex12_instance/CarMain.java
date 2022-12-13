package com.lec.ex12_instance;
/*
	클래스멤버(Static 멤버) vs 인스턴스멤버(객체멤버)

	1. 클래스멤버 : 클래스관점(클래스에 소속된)에서 정의된 필드, 생성자, 메서드(static으로 정의된 필드, 메서드)
	2. 인스턴스멤버 : 객체관점(객체에 소속된)에서 정의된 필드, 메서드
	
	클래스멤버는 객체에 소속된 멤버가 아니기 때문에 객체가 생성되지 않아도 사용할 수 있지만
	인스턴스멤버는 반드시 객체가 생성된 후에 사용할 수 있다.
	
	클래스멤버의 접근은 "클래스명.정적멤버"로 접근하고 객체맴버는 "객체명.객체멤버"의 형태로 접근한다.
*/
public class CarMain {
	public static void main(String[] args) {
		
		//Car.company;
		Car.method1();
		Car.method2();
		
		Car myCar = new Car();
		myCar.model="마이바흐";
		System.out.println("객체에서 정적멤버 접근 : company="+myCar.company);
		// System.out.println("객체에서 정적멤버를 접근 : method1="+myCar.method1()); // 에러
		myCar.method1();
		System.out.println("객체멤버 접근 : model="+myCar.model);
		myCar.method2();
		System.out.println();
		
		Car yourCar=new Car();
		System.out.println("객체맴버 접근 : model="+yourCar.model);
		System.out.println("현대" + yourCar.company);
		yourCar.method2();
		
		myCar.company="현대자동차";
		System.out.println("Car.company : "+Car.company);
		System.out.println("myCar.company : "+myCar.company);
		System.out.println("yourCar.company : "+yourCar.company);
		// 나는 마이카의 컴퍼니를 현대자동차로 바꿨는데 모두 바뀐 모습. 
	}
}



class Car{
	static String company="벤츠"; // 정적멤버. <- 여기 파이널 추가하면 myCar.company="현대자동차"; 여기 에러뜸.
	String model; // 객체멤버
	int speed; // 객체멤버


	@Override
	public String toString() {
		return "Car [company="+company+", model=" + model + ", speed=" + speed + "]";
	}
	
	static void method1() {
		System.out.println("정적멤버 method가 호출되었습니다.");
	}
	
	static void method2() {
		System.out.println("정적멤버 method1가 호출되었습니다.");
	}
}