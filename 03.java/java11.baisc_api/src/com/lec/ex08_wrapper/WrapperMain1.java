package com.lec.ex08_wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		// 1. 수동박싱
		//    1) 생성자이용
		@SuppressWarnings("deprecation")
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("100");
		System.out.println("Integer값의 범위 = " + obj1.MIN_VALUE + " ~ " + obj1.MAX_VALUE);
		System.out.println(obj2.toString());
		System.out.println();
		
		//    2) valueOf()
		Integer obj3  = Integer.valueOf(100);
		Integer obj4  = Integer.valueOf("100");
		
		Double obj5 = new Double(10.0);
		Double obj6 = Double.valueOf(3.14);
		Double obj7 = Double.valueOf("3.14");
		
		// 2. 언박싱
		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();
		int val4 = obj4.intValue();
		
		double val5 = obj5.doubleValue();
		double val6 = obj6.doubleValue();
		double val7 = obj7.doubleValue();
		
		// 3. 자동박싱
		Integer obj8 = 100;
		System.out.println("value = " + obj8.intValue());
		System.out.println(obj8 + " : " + obj8.toString());
	}
}
