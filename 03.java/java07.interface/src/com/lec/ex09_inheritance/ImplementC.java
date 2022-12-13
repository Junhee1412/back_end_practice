package com.lec.ex09_inheritance;

public class ImplementC implements interfaceC{

	@Override
	public void methodA() {
		System.out.println("InterfaceA.methodA()를 구현");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceB.methodB()를 구현");
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceC.methodC()를 구현");		
	}

}
