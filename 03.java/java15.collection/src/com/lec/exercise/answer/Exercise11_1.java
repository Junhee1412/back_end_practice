package com.lec.exercise.answer;

import java.util.*;

	class Exercise11_1 {
		public static void main(String[] args) {
			ArrayList list1 = new ArrayList();
			ArrayList list2 = new ArrayList();
			ArrayList kyo = new ArrayList(); // 교집합
			ArrayList cha = new ArrayList(); // 차집합
			ArrayList hap = new ArrayList(); // 합집합
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			list2.add(3);
			list2.add(4);
			list2.add(5);
			list2.add(6);
			/*
			(1) . 알맞은 코드를 넣어 완성하시오
			*/
			cha.addAll(list1);
			cha.removeAll(list2);
			hap.addAll(cha);
			hap.addAll(list2);
			kyo.addAll(hap);
			kyo.retainAll(list1);
			kyo.retainAll(list2);
						
			System.out.println("list1="+list1);
			System.out.println("list2="+list2);
			System.out.println("kyo="+kyo);
			System.out.println("cha="+cha);
			System.out.println("hap="+hap);
		}
	}