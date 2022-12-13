package com.lec.exercise.answer;

public class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
}
class MemberService{
	public boolean login(String id, String password) {
		
		if(id =="hong") {
			if(password=="12345") {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}