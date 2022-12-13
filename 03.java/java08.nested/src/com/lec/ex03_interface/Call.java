package com.lec.ex03_interface;

public class Call implements Button.OnClickListener{

	@Override
	public void OnClick() {
		System.out.println("전화를 겁니다.");
	}
	
}
