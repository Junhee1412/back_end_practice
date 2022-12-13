package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(Integer.valueOf(87), "홍길동");
		scores.put(98, "홍길순");
		scores.put(75, "홍길녀");
		scores.put(95, "홍길자");
		scores.put(80, "홍길상");
		
		// 정렬하기 - descendingMap(), descendingKeySet()
		NavigableMap<Integer, String> dm = scores.descendingMap();
		Set<Map.Entry<Integer, String>> de = dm.entrySet();
		
		for(Map.Entry<Integer, String> entry:de) {
			System.out.println(entry.getValue() + "=" + entry.getKey());
		}
		System.out.println();
		
		// 내림차순 -> 오름차순
		NavigableMap<Integer, String> am = dm.descendingMap();
		Set<Map.Entry<Integer, String>> ae = am.entrySet();

		for(Map.Entry<Integer, String> entry:ae) {
			System.out.println(entry.getValue() + "=" + entry.getKey());
		}
		
	}

}














