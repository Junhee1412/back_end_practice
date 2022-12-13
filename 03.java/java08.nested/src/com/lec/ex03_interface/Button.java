package com.lec.ex03_interface;

public class Button {
	private OnClickListener listener;
	XXX xxx;
	//메서드 
	void click() {
		listener.OnClick();
	}
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	//중첩인터페이스
	interface OnClickListener{
		void OnClick();
	}
}

interface XXX{
	void OnClick();
}