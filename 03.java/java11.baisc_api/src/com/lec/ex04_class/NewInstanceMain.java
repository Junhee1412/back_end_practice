package com.lec.ex04_class;

public class NewInstanceMain {

	public static void main(String[] args) throws Exception {
		
		boolean type = true;
		Class _class;
		
		if(type) {
			_class = Class.forName("com.lec.ex04_class.SendAction");
		} else {
			_class = Class.forName("com.lec.ex04_class.ReceiveAction");
		}

		Action action = (Action) _class.newInstance();
		action.execute();
	}

}

interface Action {
	void execute();
}

class SendAction implements Action {

	@Override
	public void execute() {
		System.out.println("문자를 보냅니다!");		
	}
}

class ReceiveAction implements Action {

	@Override
	public void execute() {
		System.out.println("문자를 받습니다!");		
	}
	
}