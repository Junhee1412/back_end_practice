package com.lec.ex03_interface;

public class ButtonMain {

	public static void main(String[] args) {
		Button button = new Button();
		button.setListener(new Call());
		button.click();
		
		button.setListener(new Message());
		button.click();
		
		button.setListener(new Youtube());
		button.click();
		
		button.setListener(new SendMail());
		button.click();
	}
}

class Youtube implements Button.OnClickListener{

	@Override
	public void OnClick() {
		System.out.println("동영상을 시청합니다!");
	}

}

class SendMail implements Button.OnClickListener {

	@Override
	public void OnClick() {
		System.out.println("메일을 보냅니다!");
	}

}
