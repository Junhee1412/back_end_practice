package com.lec.ex01_string;

/*
	1. 데이터타입분류
		
		1) 기본타입(premetive type)
		
		   정수(byte, short, char, int, long), 실수(float, double), 논리(boolean) 데이터타입
		   
		2) 참조타입(Reference type)
		
		   객체가 저장되어있는 메모리의 주소를 참조하는 타입으로 Array(배열), Enum(열거),
		   Class(클래스), Interface(인터페이스)가 있다.
		   
		3) 기본 vs 참조
		
		   기본타입은 실제로 값을 변수에 저장하는 반면에 참조타입은 객체가 저장되어 있는 메모리의
		   주소를 저장하고 있는 데이터 타입이다.
		   
		   Java는 문자열을 String이라는 참조변수(class) 변수에 저장하기 때문에 String변수의 타입을
		   선언해야 한다. 실제로는 문자열을 String변수에 저장한다는 말은 틀린말이다. 문자열이 직접
		   변수에 저장되는 것이 아니라 문자열을 String객체가 생성될때 그 객체가 Heap메모리영역에
		   생성되고 String변수는 String객체가 저장되어 있는 힙영역의 메모리주소를 참조한다.
		   
		   Java는 문자리터럴이 동일하다면 String리터럴을 공유하도록 설계되어있다. 일반적으로 변수에
		   문자를 저장할 경우에는 문자열리터럴을 사용하지만 객체 생성 연산자인 new를 사용해서 직접
		   String객체를 생성할 수 있다.
		   
		   new연산자는 힙영역에 새로운 객체를 생성하는 연산자로 "객체생성연산자"라고 한다.
		
	2. 메모리사용영역
	
		1) Stack(스택)영역
			
			선언된 변수가 저장되는 메모리 영역을 말한다.
			
		2) Heap(힙)영역
		
			힙영역은 객체와 배열등이 생성(저장)되는 메모리영역이다. 힙영역에 생성된 객체와 배열은
			스택영역의 변수나 다른 객체의 필드에서 참조한다. 참조하는 변수나 필드가 없다면 의미가
			없는 쓰레기 객체가 되기 때문에 이런 객체를 쓰레기(garbage)로 취급되고 JVM의 쓰레기수집기
			(gc, gabage collector)를 실행 시켜서 객체를 힙영역에서 자동으로 제거한다.
			
			JVM이 자동으로 삭제해 주기 때문에 개발자는 별도의 코드를 작성할 필요가 없다.
			
		3) Memory(메서드)영역
		
			코드에서 사용되는 클래스파일(~.class)들은 JVM의 클래스로더(class loader)가 읽어서
			상수, 필드, 메서드, 생성자등을 구분해서 메서드영역에 저장해 둔다. 이 영역은 모든
			쓰레드(프로그램)가 공유하는 영역이다.
			
		4) Constant(Literal)영역
		
			literal이 저장되는 영역이다.
		
*/
public class ReferenceTypeMain {

	public static void main(String[] args) {
		
		int val = 100;
		
		String str1 = "홍길동";								//리터럴 - C.P영역
		String str2 = "홍길동";								//리터럴 - C.P영역(str2의 리터럴은 str1의 리터럴과 동일값)
		String str3 = new String ("홍길동");				//객체 - 힙영역
		String apt32 = new String ("삼성래미안 32평");		//
		String apt40 = new String("푸르지오 40평");
		apt32 = null; //apt32변수는 더 이상 참조하는 객체("삼성래미안 32평")가 없기 때문에 그 객체는 쓰레기가 된다. 
		
		ReferenceTypeMain rf = new ReferenceTypeMain();		//ReferenceTypeMain은 클래스이기 때문에 참조타입
		//ReferenceTypeMain() : 생성자(클래스이름과 동일한 이름을 가진 메서드를 생성자라고 한다.)
		
		int i1 = 100;
		String person1 = "소향";
		String person2 = "소향";
		String person3 = new String ("소향");
		String person4 = new String ("소향");
		
		System.out.println(person1==person2); // true  값: 소향 == 값: 소향
		System.out.println(person1==person3); // false 값: 소향 == 소향이 들어있는 번지수
		System.out.println(person1==person4); // false 위와 같은이유
		System.out.println(person3==person4); // false 서로 다른 주소에 저장되어 있기 때문에 false
		System.out.println();
		
		//순수하게 값만 비교하는 메서드
		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));
		System.out.println(person1.equals(person4));
		System.out.println(person3.equals(person4));
		
		//객체의 메모리 주소 확인
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		System.out.println(person4.hashCode());
		System.out.println(rf.hashCode());
		
	
	}
}
