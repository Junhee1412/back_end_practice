package com.lec.ex02_variables;

public class VariableScopeMain {

	public static void main(String[] args) {
		// 변수의 사용범위
		// local vs global(지역변수 vs 전역변수)
		int var1 = 10;
		System.out.println("var1의 값 = " + var1);
		System.out.println();
		
		if(true) {
			int var2;
			var1 = 20; // 전역변수
			var2 = 20; // 지역변수
			//var3 = 20; // 에러 : var3은 하기 if block에서만 상용할 수 있는 지역변수이기 때문에 수정불가능!
		}
		if(true) {
			int var3;
			var1 = 30;
			//var2 = 30; // 에러 : var2는 상기 if block에서만 상용할 수 있는 지역변수이기 때문에 수정불가능!
			var3 = 30;
			
		}
		System.out.println("var1의 값 = " + var1); //30으로 출력
		//System.out.println("var2의 값 = " + var2); // 에러 : 전역에서 사용 불가능
		//System.out.println("var3의 값 = " + var3); // 에러 : 전역에서 사용 불가능
	}

}
