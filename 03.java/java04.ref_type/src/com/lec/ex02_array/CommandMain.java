package com.lec.ex02_array;

public class CommandMain {

	public static void main(String[] args) {
		//xxx.java -> javac.exe -> xxx.calss -> java.exe -> class loader
		//method메모리영역에 loading을 한다.
		//외부에서 xxx.class파일을 실행하기 위해서는 c:\>java.exe xxx.class 값1, ...값n
		//예를 들어서 덧셈연산을 하는 클래스 파일이 있을 경우에 2개의 피연산자를 전달
		//해야 한다.
		
		int[] val = {10, 20};
		System.out.println("10 + 20 = " + (val[0] + val[1]));
		
		if(args.length < 2) {
			System.out.println("전달되는 매개변수는 2개 이상이어야 합니다!");
			System.exit(0);//정상적인 완료의미
		}
		
		System.out.println("args의 갯수 = " + args.length);
		System.out.println("args[0] + args[1] = " + (args[0]+args[1]));
		System.out.println("args[0] + args[1] = " + (Integer.parseInt(args[0])+Integer.parseInt(args[1])));
		System.out.println();
		
		//향상된 for문은 and 배열
		int sum=0;
		for(String num:args) {
			sum += Integer.parseInt(num);
		}
		System.out.println("총 합계 = " + sum);
	}
}
