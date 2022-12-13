package com.lec.ex01_op;

public class IncDecOperatorMain {
/*
	증감연산자 (++, --)
	
	증감연산자는 변수의 값을 1씩 증가(++) or 1씩 감소(--)시키는 연산자를 말한다.
	boolean타입을 제외한 모든 기본 데이터타입의 피연산자에 사용할 수 있다.
	증감연산자는 선언위치에 따라 전위, 후위 증감연산자로 구분이 된다.
	변수 앞에 정의된 것을 전위증감연산자, 변수 뒤에 선언된 것을 후위 증감연산자
	
	주의할 점은 다른 연산자와 함께 사용되는 연산식에서는 증감연산자의 위치에 따라
	연산결과가 다르게 나오므로 주의해야 한다.
	
	전위연산자는 연산전에 증감을 시키고 후위연산자는 연산후에 증감을 시킨다.
	*/
	
	public static void main(String[] args) {
		
		int x=10, y=10, z;
		x++; // x = x+1
		++x; // x+1 =x
		System.out.println("x = " + x); // 12
		
		y--;
		--y;
		System.out.println("y = " + y); // 8
		
		z = x++;
		System.out.println("z = " + z); // 12
		System.out.println("x = " + x); // 13
		System.out.println("-----------------------------------------");
		
		z = ++x;
		System.out.println("z = " + z); // 14
		System.out.println("x = " + x); // 14
		
		//x=14, y=8
		z = ++x + y--;
		System.out.println("x = " + x); //15
		System.out.println("y = " + y); //7
		System.out.println("z = " + z); //23
	}
}