package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMain1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Database");
		set.add("Python");
		set.add("JDBC");
		set.add("R");
		set.add("Java");//중복은 에러 발생하지 않지만 저장되지 않는다.
		set.add("SQL");
		System.out.println("총 객체수 = " + set.size());
		System.out.println();
		
		//Set컬렉션 읽기
		Iterator<String> data = set.iterator();
		while(data.hasNext()) {
			String val = data.next();
			System.out.println(val);//순서가 없다. 무작위로 정해짐
		}
		System.out.println();
		//data.next(); (에러)NoSuchElementException
		System.out.println(data.hasNext());//false
		
		data=set.iterator();
		System.out.println(data.hasNext());//true
		System.out.println(data.next());
		System.out.println();
		
		//Set컬렉션 삭제
		set.remove("Database");
		data = set.iterator();
		while(data.hasNext()) {
			String val = data.next();
			System.out.println(val);//순서가 없다. 무작위로 정해짐
		}
		
		//전체삭제
		set.clear();
		System.out.println("총 객체수 = " + set.size());
	}

}
