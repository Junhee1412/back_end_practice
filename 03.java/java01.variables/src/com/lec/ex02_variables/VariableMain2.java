package com.lec.ex02_variables;

public class VariableMain2 {

	public static void main(String[] args) {
		//1. 변수의 선언
		int val1 = 10;
		int val2 = 10;
		
		//2. 변수의 동시선언
		int a = 0, b, c;
		int x=10, y=20, z=30;
		System.out.println("a = " + a);
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		System.out.println();
		
		//3. 변수선언과 변수타입(기본타입, premetive type)
		//   1) 정수 : byte(1), short(2), char(2), int(4), long(8)
		
		byte b1; //-128~127
		byte b2;
		b1 = -128;
		b2 = 127;
		
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
		
		// b1 = -129; // 에러 : 표현할 수 있는 값의 범위를 초과
		// b2 = 128;  // 에러 : 표현할 수 있는 값의 범위를 초과
		
		b1 = (byte) -2372737; //강제형변환(int에서 byte로 바뀌면서 다른 숫자로 형변환되어 나온다.) 
		System.out.println("b1 = " + b1);
		System.out.println("-------------------------------------");
		// 129 기본이 int
		// 129.0 기본이 double
		
		// b. char : 한 개의 문자(내부적으로는 유니코드값(UTF-8문자셋의 코드정수값))로 저장
		//         : 작은 따옴표로 선언
		char chr1 = 'A'; // A는 내부적으로 65라는 정수값으로 저장
		System.out.println("chr1 = " + chr1);
		
		char chr2 = 66;
		System.out.println("chr2 = " + chr2); //B로 출력
		
		char chr3 = 97; //a~z : 97~122
		System.out.println("chr3 = " + chr3); //a로 출력
		
		char chr4 = 48; //0~9 : 48~57
		System.out.println("chr4 = " + chr4); //0로 출력
		
		char chr5 = 44032; //가 : 44032
		System.out.println("chr5 = " + chr5); //가로 출력

		char chr6 = 55203; //힣 : 55203
		System.out.println("chr6 = " + chr6); //힣로 출력
		
		//c. int
		
		int int1 ='힣';
		System.out.println("int1 = " + int1);
		
		int int2 = 'z';
		System.out.println("int2 = " + int2);
		
		int1 = -2147483648;
		int1 = 2147483647;
		// int1 = -2147483649; //에러 범위 초과
		// int1 = 2147483648;  //에러 범위초과
		
		//d. long
		// long lng1 = -2147483649; // 에러 : Java에서 숫자의 기본 데이터타입은 int
		long lng1 = -2147483649l;//뒤에 l, L 을 주지 않으면 에러가 생김 L을 주면 메모리에 8byte로 잡히면서 변수 선언이 가능해짐.
		long lng2 = 2147483648L;
		
		//e. short
		
		short short1; // -2의 15승 ~ 2의 15승 -1의 범위값을 저장할 수 있다.
		System.out.println("-------------------------------------");		
				
		//	 2) 실수 : float(4), double(8)
		//		Java에서는 정수타입의 기본형이 int타입이지만 실수타입의 기본형은 double타입이다.
		//		float로 선언할 경우는 명시적으로 float임을 선언하거나 데이터타입변경(형변환)을 해야 한다. 이렇게 1.0f or 1.0F
		
		//	a. float
		float f1 = 3.14f; // f or F는 명시적으로 실수타입의 값을 float타입으로 선언
		float f2 = 3.141592F;
		System.out.println("f1 = " + f1 + ", f2 = " + f2);
		
		double d1 = 3.14;
		double d2 = 3.141592;
		double d3 = 3.14d;
		double d4 = 3.141592D;
		//float f3 = 3.141592D; //에러 : 강제형변환을 하던지 타입을 변경해야 한다.
		System.out.println("d1 = " + d1 + ", d2 = " + d2 + ", d3 = " + d3 + ", d4 = " + d4);
		System.out.println("-------------------------------------");			
		
		//	 3) 논리 : boolean(1), true와 false, 내부적으로는 true = 1, false = 0의 값을 가지고 있다.
		boolean bool1 = true;
		boolean bool2 = false;
		// boolean bool3 = 1; // 에러 : 1, 0은 기본이 int타입이라 boolean으로 형변환이 안된다.
		// boolean bool4 = 0;
	}
}
