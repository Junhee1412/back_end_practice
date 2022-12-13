package com.lec.ex01_object.ex03_tostring;

/*
	객체의 문자정보(totString())
	
	Object클래스의 toString()메서드는 객체의 문자정보를 리턴한다.
	객체의 문자정보란 객체를 문자열로 표현한 값을 말한다. 기본적으로 Object.toString()
	메서드는 "클래스명@16진수해시코드"로 구성된 문자열을 리턴한다.
	
	Object.toString()메서드의 리턴값은 실제적으로는 별 의미가 없는 정보이기 때문에
	하위 클래스에서는 Object.toString()를 재정의해서 유익한 정보를 리턴하도록 한다.
	
	예를 들어 java.util.Date.toString()메서드를 보면 현재의 시스템날짜와 시간정보를
	리턴한다. 그리고 String클래스의 toString()메서는 저장하고 있는 문자열을 리턴한다.
*/
public class SmartTelevision {

	private String company;
	private String model;
	
	public SmartTelevision(String company, String model) {
		this.company = company;
		this.model = model;
	}

	@Override
	public String toString() {
		return "SmartTelvision [company=" + company + ", model=" + model + "]";
	}	
}
