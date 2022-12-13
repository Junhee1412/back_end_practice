package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		//1. ArrayList - non Generic
		//1) add
		List list = new ArrayList();
		list.add("문자열");
		list.add(new String("소향"));
		list.add(100);
		list.add(Integer.valueOf(100));
		list.add(new Car());
		list.add(new Apple());
		list.add(new Hammer());
		
		//2)get //얘네들이 배열의 0번째가 문자열이어도 이게 문자열인지 몰라서 
				//강제 형변환을 시켜서 get해야 가져올 수 있음.
		String str1 = (String)list.get(0);
		String str2 = (String)list.get(1);
		Integer val1 = (Integer) list.get(2);
		Integer val2 = (Integer) list.get(3);
		Car car = (Car) list.get(4);
		Apple apple = (Apple) list.get(5);
		Hammer hammer = (Hammer) list.get(6);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(car);
		System.out.println(apple);
		System.out.println(hammer);
		System.out.println();
		
		//2. ArrayList - Generic
		List<String> list1 = new ArrayList<>(); //배열의 기본크기는 10개
		
		list1.add("Java");
		list1.add("JDBC");
		list1.add("JSP");
		list1.add("SpringFramework");
		list1.add("Python");
		list1.add("R");
		list1.add("C#");
		//list1.add(100); 제네릭타입으로 String으로 제한했기 때문에 안됨.
		//list1.add(Integer.valueOf(100));
		//list1.add(new Car());
		//list1.add(new Apple());
		//list1.add(new Hammer());
		
		//제네릭타입으로 선언되었기 때문에 형변환이 필요없다.
		//형변환을 하지 않아도 가져올 수 있다.
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		System.out.println(list1.get(6));
		System.out.println();
		
		
		
		//3. 삽입 - add(위치, 값)
		list1.add(2, "JSP/Servlet");
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		System.out.println(list1.get(5));
		System.out.println(list1.get(6));
		System.out.println(list1.get(7));
		System.out.println();
		
		//4. 삭제 - remove(위치)
		list1.remove(2);
		for(int i = 0; i<list1.size();i++) {
			System.out.println("list[" + i + "] = " + list1.get(i));
		}
		System.out.println();
		
		//5. 중복확인
		list1.add(2, "JSP");
		for(int i =0; i<list1.size();i++) {
			System.out.println("list["+i+"] = " + list1.get(i));
		}
		System.out.println();
		
		//6. 전체삭제 clear()
		list1.clear();
		System.out.println("list1의 갯수 = " + list1.size());
	}

}

class Car{}
class Apple {}
class Hammer {}