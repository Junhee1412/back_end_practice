package com.lec.ex01_class;

public class Human {

		//1. 속성(field)
		String name;
		String gender;
		int age;
		
		//2. 생성자
		//기본생성자는 생략이 가능
		Human() {}; //기본생성자
		Human(String xxx){
			//System.out.println("객체의 이름 = " + xxx);
			this.name=xxx;
		}//기본생성자외
		Human(String name, String gender){
			this.name=name;
			this.gender=gender;
		}
		Human(String name, String gender, int age){
			this.name=name;
			this.gender=gender;
			this.age=age;
		}
		
		Human(String name, int age, String gender){
			this.name =name;
			this.gender =gender;
			this.age = 9999;
		}
		
		//3. 메서드(기능)
		void move(){
			System.out.println(this.name + "움직입니다!");
		};
		void move(String name) {
			System.out.println(name + "이(가) 움직입니다!");
		}
		void think(){
			System.out.println(this.name + "이 생각을 합니다!");
		};
		void speak(){
			System.out.println(this.name + "이 말을 합니다.");
		};
		void eat(){
			System.out.println(this.name + "음식을 먹습니다!");
		};

}
