package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		
		Set<Member> members = new HashSet<>();
		
		members.add(new Member("손흥민", 30));
		members.add(new Member("이강인", 21));
		members.add(new Member("손흥민", 30));
		members.add(new Member("손흥민", 20));
		System.out.println("총 객체수 = " + members.size());
		
		for(Member member:members) {
			System.out.println(member.toString() + ", " + member.hashCode());
		}
	}

}

class Member{
	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int hashCode() {
//		return this.name.hashCode() + age;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		//name과 age가 같을 경우에는 동일한 객체로 판단해서 true를 리턴하고
//		//아닐경우에는 false가 리턴되도록 equals메서드를 재정의
//		if(obj instanceof Member) {
//			Member member = (Member) obj;
//			return(member.name.equals(this.name) && (member.age == this.age));
//		}else {
//			return false;
//		}
//	} 아래와 동일

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}