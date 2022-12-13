package com.lec.ex05_compare;

import java.util.Iterator;
import java.util.TreeSet;

/*
	Comparable과 Comparator
	
	TreeSet객체와 TreeMap의 키는 저장과 동시에 자동으로 오름차순으로 정력되는데 숫자(Integer, Double..)
	타입일 경우에는 값으로 정렬하고 문자열(String)타입일 경우에는 유니코드로 정렬된다.
	
	TreeSet객체와 TreeMap을 정렬하기 위해서는 java.lang.Comparable인터페이스를 구현한 객체를 요구하는데
	Integer, Double, String은 모두 Comparable인터페이스를 구현하고 있다.
	
	사용자가 정의한 클래스를 자동으로 정렬을 하고자할 경우에는 Comparable을 구현해야 한다. Comparable
	인터페이스는 compareTo()추상메서드가 정의되어 있기 때문에 사용자가 정의하는 클래스도 Comarable을
	구현하려면 compareTo()를 재정의해야 한다.
	
	compareTo()메서드는 int값을 리턴하는데 객체가 동일할 경우는 0, 작을 경우 -1, 클 경우는 1을 리턴한다.
	TreeSet, TreeMap의 키가 Comparable을 구현하고 있지 않을 경우에는 객체를 저장하는 순간 ClassCastException
	예외가 발생한다.
*/
public class ComparableMain {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<>();
		
		ts.add(new Person("홍길동", 99));
		ts.add(new Person("홍길녀", 90));
		ts.add(new Person("홍길자", 87));
		ts.add(new Person("이강인", 88));
		ts.add(new Person("손흥민", 89));
		ts.add(new Person("류현진", 91));
		
		System.out.println("총 객체 수 = " + ts.size());
		
		Iterator<Person> persons = ts.iterator();
		while(persons.hasNext()) {
			Person person = persons.next();
			System.out.println(person.name+" = "+person.age);
		}
	}

}

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//1. 이름순으로 정렬
//	@Override
//		public int compareTo(Person o) {
//			return this.name.compareTo(o.name);
//		}
	
	//2. 이름과 나이로 정렬
//	@Override
//	public int compareTo(Person o) {
//		String x = this.name+this.age;
//		String y = o.name+o.age;
//		return x.compareTo(y);
//	}
	
	//3. 
	//실습1) 나이로 정렬(if)
//	@Override
//	public int compareTo(Person o) {
//		
//		int x = this.age;
//		int y = o.age;
//		
//		if(x>y) {
//			return 1;
//		}else if(x==y) {
//			return 0;
//		}else {
//			return -1;
//		}
//	}
	//실습2) 나이로비교(삼항연산자)
	
	@Override
	public int compareTo(Person o) {
		int x = this.age;
		int y = o.age;
		
		return this.age>o.age ? 1 : this.age == o.age ? 0 : -1;
		
	}
	
//	실습3) Integer의 compare()메서드이용
//	@Override
//	public int compareTo(Person o) {
//		
//		Integer x = this.age;
//		Integer y = o.age;
//		
//		return x.compareTo(y);
//		Integer.compareTo(this.age,o.age);
//	}
	
}



