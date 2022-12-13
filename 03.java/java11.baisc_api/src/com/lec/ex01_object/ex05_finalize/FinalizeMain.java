package com.lec.ex01_object.ex05_finalize;

public class FinalizeMain {

	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1;i<=50;i++) {
			counter = new Counter(i);
			counter = null; //생성된 객체를 더 이상 참조하지 않는다. 즉, 쓰레기객체
			System.gc();    //GC에게 요청(사용하지 않는 객체는 힙 영역에서 삭제할 것
		}
	}

}
