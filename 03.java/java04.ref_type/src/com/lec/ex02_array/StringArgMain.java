package com.lec.ex02_array;


//java.exe com.lec.ex02_array.StringArgMain.class 값1 값2 ... 값n

public class StringArgMain {

	public static void main(String[] args) {
		
		System.out.println("전달되는 배열의 갯수 = " + args.length);
		
		int sum = 0;
		
		for(int i=0; i<args.length;i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("1~10까지의 합 = " + sum);
	}

}
