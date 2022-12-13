package com.lec.ex02_trycatch;

public class TryCatchMain1 {

	public static void main(String[] args) throws Exception{
		
		//1.일반예외
		try {
			Class _class = Class.forName("java.lang.Stringxxx");
			System.out.println("클래스를 찾았습니다!");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못했습니다!!");
			System.out.println();
			
			e.printStackTrace();
			System.out.println();
			
			System.out.println(e.getMessage());
		}

	}

}
