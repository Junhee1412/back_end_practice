package com.lec.ex01_object.ex04_clone.deep;

public class MemberMain {

	public static void main(String[] args) {
		//1. 원본객체생성
		Member org_member = new Member("홍길동", 1000, new int[] {90,84,92}, new Car("포르쉐011"));
		
		//2. 원본객체 생성후 참조타입객체의 값을 변경
		Member clone_member = org_member.getMember();
		
		System.out.println("원본 scroes = " + org_member.scores.hashCode());
		System.out.println("사본 scroes = " + clone_member.scores.hashCode());
		System.out.println("원본 car = " + org_member.car.hashCode());
		System.out.println("사본 car = " + clone_member.car.hashCode());
		System.out.println();
		
		clone_member.scores[0]=100;
		clone_member.car=new Car("벤츠");
		
		System.out.println("복제객체의 필드값");
		System.out.println("이름 = " + clone_member.name);
		System.out.println("나이 = " + clone_member.age);
		System.out.print("점수 = [");
		for(int i=0;i<clone_member.scores.length;i++) {
			System.out.print(clone_member.scores[i]);
			System.out.print(i==(clone_member.scores.length-1)?"":",");
		}
		System.out.println("]");
		System.out.println("소유차량 = " +  clone_member.car.model);
		System.out.println();
		
		System.out.println("원본객체의 필드값");
		System.out.println("이름 = " + org_member.name);
		System.out.println("나이 = " + org_member.age);
		System.out.print("점수 = [");
		for(int i=0;i<org_member.scores.length;i++) {
			System.out.print(org_member.scores[i]);
			System.out.print(i==(org_member.scores.length-1)?"":",");
		}
		System.out.println("]");
		System.out.println("소유차량 = " +  org_member.car.model);
	}

}
