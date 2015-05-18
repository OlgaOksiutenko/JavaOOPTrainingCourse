package com.tyshchenko.training.java.oop.lesson2.phone;

/**
 * @author Alexander Tyshchenko.
 */
public abstract class Phone {
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	protected int number;
	
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	public int getNumber(){
		return number;
	}
	public void answer(){
		System.out.println("Answer is received");
	}


	public abstract void countCalls();
	public abstract void countSms();
	public void call(String number) {
		System.out.println("Phone class is calling " + number);
	}
	public void call(int number){
		System.out.println("Phone is calling on number "+ number);
	}
	
	public abstract void sendSMS(String number, String message);

}
