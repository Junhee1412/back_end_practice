package com.lec.ex01_object.ex02_hashcode;

/*
	객체의 해시코드(hashCode())
	
	객체의 해시코드란? 객체를 식별하는 하나의 정수값을 말한다. Object의 hashCode()
	메서드는 객체의 메모리번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체
	마다 다른 값을 가지고 있다. 논리적으로 동등비교시에 hashCode를 재정의할 필요성이
	있는 Collection Framework에서 HashSet, HashMap, HashTable은 equals()메서드를 이용해서
	비교하기 때문이다.

*/
public class Key {

	public int number;
	
	public Key(int number) {
		this.number=number;
	}
}
