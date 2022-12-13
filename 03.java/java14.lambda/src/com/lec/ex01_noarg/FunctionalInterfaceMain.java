package com.lec.ex01_noarg;

/*
	1. 기본문법
	
		a. () -> {} 								//매개변수가 없을경우
		b. (int a) -> {} or (a) -> {} or a -> {}    //매개변수가 있을 경우(한개만)
		c. (a,b,c) -> {}
		d. () -> 실행문;							//실행문이 한개만 있을 경우 중괄호 생략가능
		e. () -> return "리턴값"					//리턴값이 있을 경우
		f. () -> 리턴값
		
	2. 함수적인터페이스(Functional Interface)
	
		모든 인터페이스를 람다식의 타깃타입으로 사용할 수 없다. 람다식이 하나의 메서드만 정의(존재)
		하기 때문에 두 개 이상의 추상메서드가 선언된 인터페이스는 람다식으로 사용할 수 없다.
		
		하나의 추상메서드가 선언된 인터페이스만이 람다식의 타깃타입이 될 수 있는데 이러한 인터페이스를
		"함수적 인터페이스 Functional Interface"라고 한다.
		
		Java에서 함수적 인터페이스를 작성할 때 2개이상의 추상메서드가 선언되지 않도록 컴파일러가 확인할
		수 있는 기능이 있는데 인터페이스 선언 시 @FunctionalInterface 어노테이션을 붙이면 된다.
		이 어노테이션은 두 개 이상의 추상 메서드가 선언되면 컴파일 오류를 발생시킨다.
*/
public class FunctionalInterfaceMain {

	public static void main(String[] args) {
		
		XXX xxx = new XXX();  // 이름이 있는 객체
		
		Runnable thread = new Runnable() {  // 익명구현객체
			@Override
			public void run() { }
		};

		FuncInterface fi1 = new FuncInterface() {
			
			@Override
			public void method() {
				System.out.println("Functional Interface(fi1) 추상메서드를 구현!!(익명구현객체)");
			}
		};
		fi1.method();
		
		//람다식
		FuncInterface fi2 = () -> {System.out.println("Functional Interface(fi2) 추상메서드를 구현!!(익명구현객체)");};
		fi2.method();
		
		FuncInterface fi3 = () -> System.out.println("Functional Interface(fi3) 추상메서드를 구현!!(익명구현객체)");
		fi3.method();
	}
}

@FunctionalInterface
interface FuncInterface {
	void method();
}


class XXX implements FuncInterface {

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
}