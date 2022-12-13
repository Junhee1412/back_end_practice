package com.lec.ex06_promotion.method;

public class MethodMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.method1(); //parent
		child.method2(); //parent 메서드 재정의
		child.method3(); //child 메서드 추가
		System.out.println();
		
		//1.자동형변환 후에는? 자식객체 -> 부모객체로 형변환
		Parent parent = child; //형변환
		
		//1) method1은 부모객체의 method1이 호출
		parent.method1();
		
		//2) method2는 자식객체에서 재정의가 되었기 때문에
		//   자식객체의 메서드 즉, child.method2가 호출된다.
		parent.method2();
		
		//3) method3는 자식객체에서 새롭게 추가된 메서드이기 때문에
		//   부모객체로 타입변환시에 삭제(짤리기)되기 때문에 호출불가
		//parent.method3();
		System.out.println();
		
		//2. 형변환이 되었을 경우에 parent와 child가 동일타입인지 여부
		System.out.println(parent == child); 
		//true : child에서 형변환이 되었기 때문에 동일 타입
		System.out.println(parent.equals(child)); //true(동일객체)method3이 없어짐.
		
		Parent p1 = new Parent();
		System.out.println(p1 == child);       //false
		System.out.println(p1.equals(child));  //false
		System.out.println();
		
		System.out.println(parent.getClass());
		System.out.println(child.getClass());
		System.out.println(p1.getClass());
	}

}
