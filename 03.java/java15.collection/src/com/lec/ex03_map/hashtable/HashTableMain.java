package com.lec.ex03_map.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		//로그인정보 : select id, pw from members;
		map.put("hong", "12345");
		map.put("kim", "67890");
		map.put("son", "abcde");
		map.put("lee", "xyz");
		
		//containsKey() : 키존재여부 확인
		System.out.println("xxxx회원의 비밀번호 = " + map.get("xxxx"));
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 비밀번호를 입력하세요!");
			System.out.println("ID=> ");
			String id = scanner.nextLine();
			System.out.println("비밀번호 => ");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).endsWith(pw)) {
					System.out.println("로그인 성공!!!!");
				}else {
					System.out.println("로그인 실패!!!!");
				}
			}else {
				System.out.println("아이디를 찾지 못하였습니다.");
				break;
			}
		}
	}
}
