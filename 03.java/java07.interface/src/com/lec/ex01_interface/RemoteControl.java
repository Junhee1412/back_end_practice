package com.lec.ex01_interface;

/*
	인터페이스(interface)
	
	Java에서는 인터페이스는 객체의 사용방법을 정의한 설계도이다. interface도 참조타입이다.
	인터페이스는 객체의 교환성(형변환)을 높여 주기 때문에 다형성을 구현하는 매우 중요한 
	역할을 한다. 특히, Java8버전에서 부터 인터페이스의 중요성은 커졌다. Java8람다식은 
	함수적인터페이스(Functional Interface)의 구현객체를 생성하기 때문이다.
	
	인터페이스는 개발코드와 객체가 서로 통신하는 접점역할을 한다. 개발코드가 인터페이스의
	메서드를 호출하면 인터페이스는 객체의 메서드를 호출한다. 그렇기 때문에 개발코드는 객체
	의 내부구조를 알 필요가 없고 인터페이스의 메서드만 알고 있으면 된다.
	
	개발코드가 직접 메서드를 호출하면 간단하지만 왜 중간에 인터페이스를 두는 이유는 개발
	코드를 직접 수정하지 않고 사용하는 객체만 변경할 수 있도록 하기 위해서 이다.
	
	인터페이스는 하나의 객체가 아니라 여러 객체들이 사용하기 때문에 어떤 객체를 사용하느
	냐에 따라서 실행내용과 결과값이 다를 수 있어서 개발코드 측면에서 보면 코드의 변경없
	이 실행내용과 리턴값을 다양화할 수 있다는 장점이 있다.	
*/
public interface RemoteControl {

	// 1. 상수필드
	// 인터페이스는 객체의 설계도 역할을 하기 때문에 런타임시 데이터를 저장할 수 
	// 있는 필드를 선언할 수 없다. 하지만, 상수는 인터페이스에 고정된 데이터로서
	// 런타임시에 변경할 수 없는 특성을 갖는다. 상수를 선언할 때는 반드시 초기화
	// 즉, 초기값을 대입해야 한다. 인터페이스에서 필드는 상수로 선언되기 때문에
	// 별도로 명시하지 않아도 컴파일시에 자동으로 public static final로 추가된다.
	int min_volumn = 0; //생략시에는 public static final이 자동추가
	public static final int MAX_VOLUMN = 100;
	
	// 2. 추상메서드
	// 추상메서드는 객체가 가지고 있는 메서드를 설명한 것으로 호출할 때 어떤 값이
	// 필요한지, 어떤 리턴값이 있는지 등을 정의한다. 실제 실행블럭은 객체(구현 or
	// 실제객체)가 가지고 있다. 인터페이스의 메서드는 무조건 추상메서드로 선언되
	// 기 때문에 생략하더레도 컴파일시에 자동으로 public abstract가 추가 된다.
	void powerOn();
	void powerOff();
	public abstract void setVolumn(int volumn);
	
	// 3. 디폴트메서드(객체멤버)
	// default메서드는 인터페이스에 선언되지만 구현객체가 가지고 있는 메서드라고 
	// 생각하면 된다. Java8버전에서 default메서드를 허용한 이유는 기존 인터페이스
	// 를 확장해서 새로운 기능을 추가하기 위해서 이다. default메서드는 실행블럭을
	// 가지고 있는 메서드로서 default키워드를 반드시 붙여야 하며 기본적으로 public
	// 접근제한자를 가지고 있고 생략하더래도 컴파일러가 자동으 추가한다.
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리!!");
		} else {
			System.out.println("무음해제");
		}
	}
	
	// 4. static메서드(인터페이스멤버)
	// 정적메서드도 Java8버전부터 사용할 수 있는데 default메서드와는 달리 객체가 
	// 생성되지 않아도 사용할 수 있는 메서드 이다. 즉, 객체멤버가 아니라 인터페이
	// 스멤버로서 "인터페이스명.메서드명"의 형태로 호출할 수가 있다.
	static void changeBattery() {
		System.out.println("건전지를 교체합니다!");
	}
}

class TVRmocon implements RemoteControl {

	@Override
	public void powerOn() { System.out.println("파워온!!!");}

	@Override
	public void powerOff() { System.out.println("파워오프");}

	@Override
	public void setVolumn(int volumn) {
		RemoteControl.changeBattery(); // 객체생성없이 인터페이스만으로 호출
	}
}



















