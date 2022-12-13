package com.lec.ex04_tree.set;

import java.util.TreeSet;

/*
	TreeSet?
	
	TreeSet은 이진트리를 기반으로 한 컬렉션이다.
	하나의 노드는 노드값은 value와 왼쪽노드, 오른쪽노드로
	참조하기 위한 변수로 구성된다.
	
	TreeSet객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서
	작으면 왼쪽노드로 크면 오른쪽노드로 저장된다.
	
*/
public class TreeSetMain1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(Integer.valueOf(99));
		scores.add(75);
		scores.add(95);
		scores.add(78);
		scores.add(78); // 중복저장불가능
		System.out.println("총 객체수 = " + scores.size());
		System.out.println();
		
		Integer score = null;
		
		// 가장 낮은 점수, 가장 높은 점수, 95바로 아래점수, 95바로 위에 점수
		score = scores.first();
		System.out.println("가장 낮은 점수 = " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수 = " + score);
		
		score = scores.lower(95);
		System.out.println("95바로 아래점수 = " + score);
		
		score = scores.higher(95);
		System.out.println("95바로 위에 점수 = " + score);
		
		score = scores.floor(95);
		System.out.println("95이거나 95바로 아래점수 점수 = " + score);
		
		score = scores.ceiling(95);
		System.out.println("95이거나 95바로 위에 점수 점수 = " + score);
		System.out.println();
		
		while(!scores.isEmpty()) {
			score = scores.pollLast(); // 가장 값이 큰 객체를 꺼내오고 삭제
			System.out.println(score + ", 남은 객체수 = " + scores.size());
		}
		System.out.println();
		
		scores.add(77);
		scores.add(66);
		scores.add(55);
		scores.add(44);
		scores.add(33);
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst(); // 가장 값이 작은 객체를 꺼내오고 삭제
			System.out.println(score + ", 남은 객체수 = " + scores.size());
		}
	
	}
}
