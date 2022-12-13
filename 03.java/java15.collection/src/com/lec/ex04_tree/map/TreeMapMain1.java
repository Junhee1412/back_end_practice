package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동");
		scores.put(98, "홍길순");
		scores.put(75, "홍길녀");
		scores.put(95, "홍길자");
		scores.put(80, "홍길상");

		Map.Entry<Integer, String> student = null;
		
		// 가장 낮은 점수, 가장 높은점수, 95바로 위/아래, 95포함 위/아래
		student = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + student.getValue() + " = " + student.getKey());
		
		student = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + student.getValue() + " = " + student.getKey());
		
		student = scores.lowerEntry(95);
		System.out.println("95 바로 아래 점수 : " + student.getValue() + " = " + student.getKey());
		
		student = scores.higherEntry(95);
		System.out.println("95 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		
		student = scores.floorEntry(95);
		System.out.println("95 포함 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		
		student = scores.ceilingEntry(95);
		System.out.println("95 포함 바로 위 점수 : " + student.getValue() + " = " + student.getKey());
		
		while(!scores.isEmpty()) {
			student = scores.pollFirstEntry(); //가장 낮은 객체를 꺼내온 후 삭제
			System.out.println(student.getValue() + "=" + student.getKey() + ", 남은 객체수 = " + scores.size());
		}
	}
}
