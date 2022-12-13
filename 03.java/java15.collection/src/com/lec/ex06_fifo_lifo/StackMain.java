package com.lec.ex06_fifo_lifo;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		
		Stack<Coin> coin_box = new Stack<>();
		coin_box.push(new Coin(50));
		coin_box.push(new Coin(100));
		coin_box.push(new Coin(10));
		coin_box.push(new Coin(1));
		coin_box.push(new Coin(500));
		coin_box.push(new Coin(500));
		
		System.out.println("총 객체수  = " + coin_box.size());
		
		while(!coin_box.isEmpty()) {
			Coin coin = coin_box.pop();
			System.out.println("꺼내온 동전 = " + coin.getValue());
		}
	}

}

class Coin {
	
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
