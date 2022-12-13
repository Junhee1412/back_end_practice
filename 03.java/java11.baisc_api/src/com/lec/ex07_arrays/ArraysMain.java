package com.lec.ex07_arrays;

import java.util.Arrays;

/*
	Arrays 클래스
	
	Arrays클래스는 배열에 관한 조작기능을 가지고 있다. 배열의 복사, 항목의 정렬,
	항목검색과 같은 기능을 제공하는 메서드를 가지고 있다.
	
	단순한 배열의 복사는 System.arraycopy()메서드를 사용할 수 있으나 Arrays는 추가
	적으로 항목정렬, 검색, 비교와 같은 기능을 제공한다. Arrays관련 모든 메서드는 
	static이기 때문에 객체생성없이 Arrays클래스로 직접 메서드를 호출할 수 있다.
*/
public class ArraysMain {

	public static void main(String[] args) {
		// 1. 기본타입 정렬 및 검색
		int[] scores = {88,99,66,77,55};
		Arrays.sort(scores);
		System.out.println(scores[0] + ", " + scores[1]);
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("항목 88의 위치 : " + index + " = " + scores[index]);
		
		// 2. String 정렬 및 검색
		String[] names = {"홍길동","이강인","손흥민"};
		Arrays.sort(names);
		System.out.println(names[0] + "," + names[1] + "," + names[2]);
		
		index = Arrays.binarySearch(names, "이강인");
		System.out.println("이강인의 위치 : " + index + " = " + names[index]);
		System.out.println();
		
		// 3. 객체의 정렬 및 검색
		// 객체를 정렬하려면 Comparable인터페이스의 추상메서드인 compareTo()메서드를
		// 재정의해야 한다. 만약 Comarable인터페이스를 구현하지 않고 정렬을 하려면 
		// 예외가 발생한다. Arrays.sort()는 자동으로 오름차순으로 정렬한다.
		Member m1 = new Member("홍길동");
		Member m2 = new Member("소향");
		Member m3 = new Member("손흥민");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		System.out.println(members[0].name + "," + members[1].name + "," + members[2].name);

		index = Arrays.binarySearch(members, m2);
		System.out.println("소향의 위치 : " + index + " = " + members[index].name);
		System.out.println();
	}

}

class Member implements Comparable<Member> {
	
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return this.name.compareTo(o.name); // -1 0 1 
	}
}