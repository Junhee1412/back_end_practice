package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapMain3 {

	public static void main(String[] args) {
		//범위검색
		
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("apple",10);
		tm.put("java",20);
		tm.put("orange",30);
		tm.put("cherry",40);
		tm.put("hammer",50);
		tm.put("car",60);
		tm.put("people",70);
		tm.put("pea",80);
		tm.put("f",90);
		tm.put("for",100);
		
		//c~f사이의 단어를 검색
		NavigableMap<String, Integer> words = tm.subMap("c", false, "f", true);
		
		for(Map.Entry<String, Integer> word:words.entrySet()) {
			System.out.println(word.getKey() + " = " + word.getValue() + " 값");
		}
	}

}
