package com.lec.ex03_compare;

public class CompareOperatorMain2 {

	public static void main(String[] args) {
		
		int v1 = 1;
		double v2 = 1.0;
		System.out.println(v1 == v2);
		
		double d1 = 0.1;
		float f1 = 0.1f;
		System.out.println(d1==f1);
		System.out.println((double)f1);
		
		//정확한 비교하기
		
		System.out.println((float)d1==f1);
		System.out.println((float)d1);
		System.out.println(d1 ==(double)f1);
		
		//정확한 연산을 하기 위해서는 이진포맷기수를 정수로 변환 후 연산을 수행한다.
		System.out.println((int)(d1*10)==(int)(f1*10));
		
	}

}
