package com.lec.ex04_while;

public class WhileMain {

	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.println(i + ",");
			i++;
		}
		System.out.println();
		
		//1~10까지의 합
		int sum =0;
		i =1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1~10까지의 합 " + sum);
	}
}