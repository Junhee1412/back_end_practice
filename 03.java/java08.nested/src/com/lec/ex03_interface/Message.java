package com.lec.ex03_interface;

public class Message implements Button.OnClickListener{

	@Override
	public void OnClick() {
		System.out.println("문자를 보냅니다.");
	}
	
}
