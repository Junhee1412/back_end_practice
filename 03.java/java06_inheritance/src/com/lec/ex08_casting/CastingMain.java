package com.lec.ex08_casting;

/*
	강제타입변환(Casting)
	
	강제타입변환은 부모타입을 자식타입으로 변환하는 것을 말한다. 형변환이
	된다고 해서 모든 부모타입이 자식타입으로 강제형변환할 수 있는 것은 아니다.
	
	강제타입변환이 되는 경우에는 자식타입이 부모타입으로 형변환된 후에 자식타입
	으로 변환되는 경우에만 강제타입변환이 될 수 있다.
	
	자식타입이 부모타입으로 자동형변환하면 부모타입에 선언된 필드와 메서드만
	사용할 수가 있다. 자식타입이 부모타입으로 자동형변환이 되면 부모타입에서
	선언된 필드와 메서드만 사용할 수 있다. 만약, 자식타입에 선언된 필드와 
	메서드를 꼭 사용해야 할 경우에는 강제형변환해서 다시 자식타입으로 변환한
	후에 자식타입의 필드와 메서드를 사용할 수가 있다.
*/
public class CastingMain {

	public static void main(String[] args) {
		
		// 1. 자동형변환
		// Child child = new Child();
		// Parent parent = child;
		Parent parent = new Child();
		parent.field1 = "사용가능";
		// parent.field2 = "사용불가";
		parent.method1();
		parent.method2(); // 사용가능하지만 child의 method2가 호출
		// parent.method3(); 사용불가
		System.out.println();
		
		// 2. 강제형변환
		// 1) 형변환가능
		int i = (int) 1.0;
		Child child = (Child) parent;
		child.field1 = "사용가능";
		child.field2 = "사용가능";
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		//2) 형변환 불가능
        Parent parent2=new Parent(); // 직접 온 놈.
        // ☆★☆★☆★ 직접 생성한 부모객체를 자식객체로 형변환하는 것은 실행시 에러가 뜬다! ☆★☆★☆★
        
        /* 자식객체 -> 부모객체 -> 자식객체의 순서로 형변환하는 것은 가능하지만 
           부모객체-> 자식객체로 직접 형변환하는경우는 ClassCastExecrption 발생. 
           따라서, 부모객체에서 자식객체로 직접형변환은 불가능 */
        
        // Child child2=(Child) parent2; // 여기서 빨간줄은 안뜨지만 실행에러가 뜬다.
        /*   ▲ 윗줄꺼 실행 에러 콘솔에 뜨는거 ▼
           Exception in thread "main" java.lang.ClassCastException: 
           class com.lec.ex08_casting.Parent cannot be cast to class com.lec.ex08_casting.Child 
           (com.lec.ex08_casting.Parent and com.lec.ex08_casting.Child are in unnamed module of loader 'app')
           at com.lec.ex08_casting.CastingMain.main(CastingMain.java:42)
        */
        System.out.println("울트라킹왕짱 중요한 로직이다.!!!!!!!!!!!!!!!!!!!!!"); // 위에 실행에러라 얘가 실행안됨
	}

}


















