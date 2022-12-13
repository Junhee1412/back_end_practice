package com.lec.ex11_method.overloading;
public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		System.out.println(rec.areaRectangle(10)); // 100
		System.out.println(rec.areaRectangle(10,6)); // 60
		System.out.println(rec.areaRectangle(10,6,100)); // 0
	}
}



// 실습. 정사각형, 직사각형의 넓이를 구하는 메서드 작성하기
// 메서드 이름은 정사각형 : areaRectangle(10), 직사각형 : areaRectangle(10,20) 
class Rectangle{
	/*
	int areaRectangle(int x) {
		System.out.println("값은 "+x*x);
		return x*x;
	}
	int areaRectangle(int x, int y) {
		return x*y;
	}
	 */
	
	int areaRectangle(int...x) {
		int mul=1;
		for(int i:x) {
			if(x.length==1) {
				mul=i*i;
			}
			else if(x.length==2){mul=mul*i;}
			else if(x.length>=3) {mul=0;} // 에러처리하고싶은에 어케해야할지 모르겠어서 걍 0을 리턴하도록 함.
		}
		return mul;
	}
	
}