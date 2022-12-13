package com.lec.ex02_objects;

import java.util.Comparator;
import java.util.Objects;

/*
	Objects 클래스
	
	Object클래스와 유사한 이름을 가진 java.util.Objects클래스는 객체의 비교, 해시코드생성,
	null여부 객체문자녈의 리턴등의 연산을 수행하는 정적메서드들로 구성된 Object의 유틸리티
	클래스이다.
	
	1. 객체비교(compare(T a, T b Comparator<T> c))
	
	   Objects.compare()메서드는 두 개의 객체(동일타입)를 비교해서 int값을 리턴한다.
	   java.util.Comparator<T>는 제네릭 인터페이스 타입으로 두 객체를 비교하는 compare(T a, T b)
	   메서드가 정의 되어 있다.
 
*/
public class CompareMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println("비교결과 = " + result);
		
		System.out.println("비교결과 = " + Objects.compare(s1, s3, new StudentComparator()));
		System.out.println("비교결과 = " + Objects.compare(s3, s1, new StudentComparator()));
		
	}

	static class Student {
		int sno;
		public Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
//			if(s1.sno < s2.sno) return -1;
//			else if(s1.sno == s2.sno) return 0;
//			else return 1;
			return Integer.compare(s1.sno, s2.sno);
		}
	}
}







