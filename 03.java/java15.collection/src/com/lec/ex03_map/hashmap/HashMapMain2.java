package com.lec.ex03_map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain2 {

	public static void main(String[] args) {
		
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "소향"), 80);
		map.put(new Student(1, "소향"), 90);
		System.out.println("총 객체수 = " + map.size());

	}

}

class Student {
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	

	// 실습. hashCode, equals를 사용자가 재정의해 동일객체 여부
	// sno, name, (sno, name)
	@Override
	public int hashCode() {
		// return Objects.hash(this.sno, this.name);
		return this.sno + this.name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return (this.sno == std.sno) && (this.name.equals(std.name));
		}
		return super.equals(obj);
	}

}