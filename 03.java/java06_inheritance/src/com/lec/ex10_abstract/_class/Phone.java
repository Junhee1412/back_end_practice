package com.lec.ex10_abstract._class;

public abstract class Phone {
	public String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void powerOn() {System.out.println("파워온!");}
	public void powerOff() {System.out.println("파워오프!");}
	
}
