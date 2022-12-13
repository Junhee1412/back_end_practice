package com.lec.ex18_getset;

import java.util.Date;

public class EmployMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		emp.setEmpno(1000);
		System.out.println("사원번호 = " + emp.getEname());
		
		emp.set질병(true);
		System.out.println("질병여부 = " + emp.is질병());
		
		Employee emp1 = new Employee(1000, "홍길동", new Date(), 1000, 10, "991118-1234567",false, true);
		Employee emp2 = new Employee(1000, "홍길순", new Date(), 1000, 10, "991118-1234567",false, true);
		System.out.println("사원번호 = " + emp1.getEname());
		System.out.println("질병여부 = " + emp1.is질병());
		System.out.println();
		
		System.out.println(emp1.toString());
		System.out.println(emp1.hashCode());
		System.out.println(emp2.toString());
		System.out.println(emp2.hashCode());
		System.out.println();
		
		System.out.println(emp1.equals(emp2));
		System.out.println();
		
		System.out.println(emp1.getClass());
		
	}

}
