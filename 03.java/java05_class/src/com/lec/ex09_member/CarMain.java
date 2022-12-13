package com.lec.ex09_member;
public class CarMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar1=new Car();// myCar. 해서 뒤에 적을수 있는 목록들 보면 private로 정의?한건 안뜬다.
		Car myCar2=new Car("Model Y");
		Car myCar3=new Car(100);
		Car myCar4 = new Car("Model Y", 120);
		Car myCar5 = new Car(300, "Model Y");
		Car myCar6 = new Car("Model X", "핑크", 600, 150);
		// myCar6 : Car에 super();(83줄)를 주석처리, toString재정의 안했을때 -> com.lec.ex09_member.Car@5e91993f
		// toString() 재정의 후 > Car [company=Tesla, model=롤스로이스, color=골드, maxSpeed=200, speed=100]
		// super.toString();은 그대로 com.lec.ex09_member.Car@5e91993f 뜬다.
		System.out.println("-------------------------------");


		myCar3.powerOn();
		myCar2.powerOff();
		System.out.println("-------------------------------");


		System.out.println(myCar2.color); // 마이카2의 컬러값을 안줬으니 null이 뜨는것.
		myCar2.color="노랑";
		System.out.println(myCar2.color); // 노랑 뜬다.
	}
}
