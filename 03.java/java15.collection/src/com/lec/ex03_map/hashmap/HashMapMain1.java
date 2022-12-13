package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain1 {

	public static void main(String[] args) {
		
		// 1. Map객체생성
		Map<String, Integer> map = new HashMap<>();

		// 2. 객체 저장 - put() 
		map.put("홍길동", 85);
		map.put("홍길순", Integer.valueOf(80));
		map.put("홍길자", 95);
		map.put("홍길녀", 75);
		map.put("홍길상", 88);
		map.put("홍길동", 99); // 키중복은 에러는 발생하지 않지만 85점이 99점으로 대체 즉, 마지막값
		System.out.println("총 객체수 = " + map.size());

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "소향");
		map2.put(1, "나얼");
		map2.put(2, "소향");
		System.out.println("총 객체수 = " + map2.size());
		
		// 3. 객체검색(1) - get(Object) 
		System.out.println("홍길동의 점수 = " + map.get("홍길동"));
		System.out.println("홍길녀의 점수 = " + map.get("홍길녀"));
		System.out.println("1번 학생의 이름 = " + map2.get(1));
		System.out.println("2번 학생의 이름 = " + map2.get(2));
		
		// 4. 객체검색(2) - keySet() 
		Set<String> keySet = map.keySet();
		Iterator<String> names = keySet.iterator();
		while(names.hasNext()) {
			String name = names.next();
			Integer score = map.get(name);
			System.out.println(name + "의 점수 = " + score);
		}
		System.out.println();
		
		// 5. 객체검색(3) - entrySet()
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entrys = entrySet.iterator();
		while(entrys.hasNext()) {
			Map.Entry<String, Integer> entry = entrys.next();
			String name = entry.getKey();
			Integer score = entry.getValue();
			System.out.println(name + "의 점수 = " + score);
		}
		System.out.println();
		
		// 6. 객체삭제 - remove()
		map.remove("홍길동");
		System.out.println("총 객체수 = " + map2.size());
		
		// 7. 전체삭제 - clear()

	}

}
