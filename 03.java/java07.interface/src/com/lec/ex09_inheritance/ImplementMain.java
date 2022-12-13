package com.lec.ex09_inheritance;

public class ImplementMain {

	public static void main(String[] args) {
		ImplementC im = new ImplementC();
		im.methodA();
		im.methodB();
		im.methodC();
		
		//1. im -> interfaceA
		
		interfaceA A = im;
		System.out.println();
		A.methodA();
		
		//2. im -> interfaceB
		interfaceB B = im;
		System.out.println();
		B.methodB();
		//3. im -> interfaceC
		
		interfaceC C = im;
		System.out.println();
		C.methodA();
		C.methodB();
		C.methodC();
		
	}

}
