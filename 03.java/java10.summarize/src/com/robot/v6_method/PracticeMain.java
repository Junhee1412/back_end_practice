package com.robot.v6_method;

public class PracticeMain {

	public static void main(String[] args) {
		
		int a [] = new int[6]; // a배열 생성
		
		for(int i=0;i<a.length;i++) {//배열에 포문으로 접근

			a[i] = (int)(Math.random()*45)+1;//로또번호 생성(1~45)
			for(int j=0;j<i;j++) {//중복 제거를 위한 서브 배열
				if(a[i]==a[j]) {//같으면
					i--;//i를 이전으로 돌려서 다시 뽑는다.
				}
			}
		}
		for(int i =0;i<a.length;i++) {//다시 배열의 index번호에 i로 포문 접근
			System.out.print(a[i]+ " ");//출력
			}
		
	}
}
