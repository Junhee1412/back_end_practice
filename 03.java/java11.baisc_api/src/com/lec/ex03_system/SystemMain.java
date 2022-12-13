package com.lec.ex03_system;

import java.util.Map;

public class SystemMain {

	public static void main(String[] args) {
		//1.exit()
		if(args.length>3) {
			System.out.println("프로그램이 비정상적으로 종료되었습니다!");
			System.exit(0);
		}
		//2.gc()
		Employee emp = null;
		for(int i =1;i<=3;i++) {
			emp = new Employee(i);
			if(i==1)emp=null;
		}
		System.out.print("emp가 최종적으로 참조하는 사원번호 = ");
		System.out.println(emp.empno);
		System.gc();
		System.out.println();
		
		//3.getenv()
		String java_home = System.getenv("JAVA_HOME");
		System.out.println(java_home);
		System.out.println();
		
		//운영체제의 환경정보를 출력
		for(Map.Entry entry:System.getenv().entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}

	}

}

class Employee{
	int empno;
	public Employee(int empno) {
		this.empno = empno;
		System.out.println("Employee(" + this.empno + ")가 메모리에 생성되었습니다!");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee(" + this.empno + ")가 메모리에서 제거되었습니다!");

	}
}