package com.lec.ex05_user;

public class Account {
	private int 잔액;

	public int getBalance() {
		return 잔액;
	}
	void 예금(int money) {
		this.잔액 = 잔액;
	}
	void 출금(int money) {
		if(잔액<money){
		System.out.println("잔액이 부족합니다!!");
	}else{
		this.잔액 -= money;
	}
}
	void 출금1(int money) throws 잔액부족{
		if(잔액<money){
			throw new 잔액부족("잔액이 부족합니다! "+(money -this.잔액)+"원이 부족합니다.");
		}else{
			this.잔액 -= money;
		}
	}
}
