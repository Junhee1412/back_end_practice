package com.lec.ex02_array;

import java.util.Arrays;

/*
	배열의 복사

	참조타입배열일 경우, 배열복사가 되면 복사되는 값이 객체의 메모리주소이기 때문에
	새 배열의 항목은 이전 배열의 항목이 참조하는 객체(메모리주소)와 동일하다.
	
	이것을 얕은 복사(shallow copy)라고 한다. 반대로 깊은 복사(deep copy)는 참조하는
	객체도 별도로 생성해서 복사하는 것을 말한다.
	
	Array 복사
	
	Java에서는 배열을 한번 생성하면 크기를 변경할 수 없기 때문에 더 많은 저장요소를
	저장하려면 보다 큰 배열을 새로 만들고 이전 배열에서 항목값을 별도로 복사해야한다.
	배열간 항목을 복사하려면 for문을 이용하거나 System.arraycopy() or Arrays.copyOfRange()
	메서드를 사용해야한다.
 */
public class ArrayCopyMain {

	public static void main(String[] args) {
		// 1. 얕은 복사
		String[] oldArray = {"Java", "Array", "Copy"};
		String[] newArray = oldArray;
		
		oldArray[0] = "Python";
		System.out.print("old array = ");
		
		for(String x : oldArray) { // 향상된 for문
			System.out.print(x + ", ");		
		}	
		System.out.println();
		System.out.print("new array = ");
		for(String x:newArray) {
			System.out.print(x + ", ");
		}
		System.out.println();		
		// 2. 깊은 복사
		//  1) for문을 이용
		String[] old1 = {"소향", "나얼", "거미"};
		String[] new1 = new String[3];
		
		for(int i = 0; i<old1.length;i++) {
			new1[i] = old1[i];
		}
		
		old1[0] = "흥민";
		
		System.out.print("old1 = ");
		for(String x : old1) { // 향상된 for문
			System.out.print(x + ", ");		
		}	
		System.out.println();
		
		System.out.print("new array = ");
		for(String x:new1) {
			System.out.print(x + ", ");
		}
		
		//  2) System.array(old, old시작, new, new시작, old크기)
		String[] old2 = {"소향", "나얼", "거미"};
		String[] new2 = new String[6];
		System.arraycopy(old2, 0, new2, 0, old2.length);
		old2[0] = "손흥민";
		new2[3] = "블랙핑크";
		new2[4] = "BTS";
		new2[5] = "이강인";
		
	    System.out.println();
		System.out.print("old2 = ");
		for(String x : old2) { 
			System.out.print(x + ", ");		
		}	
		System.out.println();
		
		System.out.print("new array = ");
		for(String x:new2) {
			System.out.print(x + ", ");
		}	
		
		//  3) Arrays.copyOf()
		//     a. Arrays.copyOf(src, new.length)
		int[] old3 = {1,2,3,4,5};
		int[] new3 = Arrays.copyOf(old3, 3);
		
		old3[0] = 100;
		
	    System.out.println();
		System.out.print("old3 = ");
		for(int x : old3) { 
			System.out.print(x + ", ");		
		}	
		System.out.println();
		
		System.out.print("new array = ");
		for(int x:new3) {
			System.out.print(x + ", ");
		}	
		
		//b. Arrays.copyOfRange(new, start, end-1)
		int[] new4 = Arrays.copyOfRange(old3, 1, 4);
		
		System.out.println();
		
		System.out.print("new array = ");
		for(int x:new4) {
			System.out.print(x + ", ");
		}		
	}
}