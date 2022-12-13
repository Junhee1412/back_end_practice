package com.lec.ex11_method.declare;

public class ComputerMain {

	public static void main(String[] args) {

		Computer com1 = new Computer();


		// 1. 일반 매개변수 이용
		int result = com1.add(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1~10까지 합 = " + result);
		
		result=com1.add(1,2,3,4,5);
		System.out.println("1~5까지 합 = " + result);


		// 2. 배열 이용
		int[] array= {1,2,3,4,5,6,7};
		result=com1.add(array);
		System.out.println("1~7까지 합 = " + result);
		
		int[] arr= {1,2,3,4,5,6,7,8,9};
		result=com1.add(arr);
		System.out.println("1~9까지 합 = " + result);


		// 3. 유동적인 매개변수 이용
		result=com1.add1(100,100,100);
		System.out.println("100 세번 더함 = " + result);
		System.out.println("10,20,30,40,50 더함 : "+com1.add1(10,20,30,40,50));
	}
}




class Computer {
	public int add(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r) {
		return i+j+k+l+m+n+o+p+q+r;
	}

	public int add(int i, int j, int k, int l, int m) {
		// TODO Auto-generated method stub
		return i+j+k+l+m;
	}

	// (위에껏들은) 매개변수 갯수가 바뀔때마다 메서드 추가해주는건 번거롭다. 배열로 받아보자.
	public int add(int[] array) {
		int sum=0;
		for(int i:array) { // int i=0; i<array.length; i++
			sum+=i;
		}
		return sum;
	}
	
	// 유동적인 매개변수 정의하기
	int add1(int...x) { // 위의 배열 받는 add와 이름 다르게 해야한다. 같으면 내부적으로 같다고 인식하나봄
		int sum=0;
		for(int i:x) {
			sum+=i;
		}
		return sum;
	}
	
}