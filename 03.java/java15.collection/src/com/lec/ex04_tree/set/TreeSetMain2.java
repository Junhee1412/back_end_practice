package com.lec.ex04_tree.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetMain2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//정렬하기 - TreeSet은 저장될 때 자동으로 오름차순으로 정렬되어 저장된다.
		System.out.println(scores);
		for(Integer score:scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		//내림차순, 오름차순정렬
		//descendingSet()      : 내림차순, 리턴타입이 NavigableSet으로 리턴
		//descendingIterator() : 내림차순, 리턴타입이 Iterator로 리턴
		NavigableSet<Integer> descSet=scores.descendingSet();
		for(Integer score:descSet) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		//내림차순 -> 오름차순
		NavigableSet<Integer> ascSet = descSet.descendingSet();
		for(Integer score : ascSet) {
			System.out.print(score + ", ");
		}
	}

}
