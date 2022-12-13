package com.lec.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain3 {

	public static void main(String[] args) {
		
		// 범위검색
		TreeSet<String> set = new TreeSet<>();
		set.add("apple");
		set.add("c");
		set.add("forever");
		set.add("javascript");
		set.add("python");
		set.add("ever");
		set.add("zoo");
		set.add("baseball");
		set.add("cherry");
		set.add("f");
		
		System.out.println("[c~f 사이의 단어 검색하기!!]");
		NavigableSet<String> words = set.subSet("c", true, "f", false);
		// 매개변수가 2개인 subSet()메서드의 리턴타입은 NavigableSet의 부모인 SortedSet 타입으로 리턴된다.
		// NavigableSet<String> words = (NavigableSet<String>) set.subSet("c", "f"); 
		for(String word:words) {
			System.out.print(word + ", ");
		}
	}

}
