package com.lec.ex05_user;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("현재 통장잔액 = "+account.getBalance());

		account.예금(100);
		System.out.println("현재 통장잔액 = "+account.getBalance());
		
		account.출금(200);
		System.out.println("현재 통장잔액 = "+account.getBalance());
		
		try {
			account.출금1(200);
		} catch (잔액부족 e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("잔액이 부족합니다!!!!!!");
		}
	}
}