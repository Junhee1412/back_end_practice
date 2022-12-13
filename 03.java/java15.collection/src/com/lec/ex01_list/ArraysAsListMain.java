package com.lec.ex01_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListMain {

	public static void main(String[] args) {
		
		//일반배열 초기화
		String[] names = {"홍길동", "홍길순", "홍길자", "홍길녀", "홍길상", "손흥민"};
		
		//ArrayList는 일반배열처럼 초기화기능이 없다.
		//대신에 Arrays.asList(값1, ...값n)을 이용해서 초기화를 한다.
		//ArrayList를 생성하고 런타임시에 필요에 따라 객체를 추가하는 방법이 일반적이지만
		//고정된 객체로 구성된 List를 생성할 경우에는 Arrays.asList()메서드를 사용하는 것이
		//간편할 수 있다.
		//다만, Arrays.asList()메서드로 생성된 ArrayList는 크기를 변경할 수 없다.
		
		List<String> list1 = new ArrayList<>(6);
		//ArrayList생성자를 이용하는 대신에 Arrays.asList로 간편하게 생성할 수 있다.
		List<String> list2 = Arrays.asList("홍길동", "홍길순", "홍길자", "홍길녀", "홍길상", "손흥민");
		//다만 asList()메서드로 생성된 List는 크기가 고정된 객체로 생성된다. 즉, 추가, 삭제는
		//불가능하다.
		
		list1.add("이강인");
		System.out.println("list1의 크기 = " + list1.size());
		list1.remove(0);
		System.out.println("list1의 크기 = " + list1.size());
		//list2.add("이강인"); 에러 asList는 추가삭제가 불가능
		//list2.remove(0);
		System.out.println("list2의 크기 = " + list2.size());
	
		for(String name:list2) {
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = 0;
		for(Integer num:numbers) {
			sum+=num;
		}
		System.out.println("1~10까지의 합 = " + sum);
	}

}
