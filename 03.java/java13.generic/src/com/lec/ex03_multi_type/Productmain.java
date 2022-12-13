package com.lec.ex03_multi_type;

public class Productmain {

	public static void main(String[] args) {
		// 1. non generic
		Product product = new Product();
		product.setKind(1);
		int num = (int) product.getKind();
		
		product.setKind("문자열");
		String str = (String)product.getKind();
		
		product.setKind(new Robot());
		Robot robot = (Robot) product.getKind();
		
		// 2. generic
		Product<Robot, String> 로봇 = new Product<>();
		로봇.setKind(new Robot());
		로봇.setModel("Super");
		System.out.println(로봇.getKind() +", "+ 로봇.getModel() + "로봇입니다");
		
		// 제네릭타입일 경우 참조타입만 가능
		Product<Car, String> 자동차 = new Product<Car, String>();
		Product<int[], Student> 학생 = new Product<>();
		Product<String, String> xxx = new Product<>();
		
		// 멀티제네릭타입일 경우 참조타입이 아닐 경우는 에러 발생
		// Product<int, Student> 학생 = new Product<>();
		// Product<String, int> yyy = new Product<>();
	}
}

class Product<K, M>{
	
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}

class Car{}
class TV{}
class Student{}
class Robot{}