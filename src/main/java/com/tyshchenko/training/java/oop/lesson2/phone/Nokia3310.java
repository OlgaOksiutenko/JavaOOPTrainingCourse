package com.tyshchenko.training.java.oop.lesson2.phone;

/**
 * @author Alexander Tyshchenko.
 */
public class Nokia3310 extends Phone {
	int smsCount;
	int callCount;
	public Nokia3310() {
		System.out.println("Nokia3310 constructor");
		callCount = 0;
		smsCount = 0;
		touch = false;
		hasWifi = false;
		screenSize = 2;
		number = 643;
	}

	@Override
	public void countCalls() {
		System.out.println("Nokia, Amount of calls = "+ callCount);
	}

	@Override
	public void countSms() {
		System.out.println("Nokia, Amount of smses = "+ smsCount);
	}

	@Override
	public void call(String number) {
		super.call(number);
		callCount++;
		System.out.println("Nokia3310 class is calling " + number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		smsCount++;
		System.out.println("Nokia3310 class is sending sms " + message + " to " + number);	
	}
	public String toString(){
        return "Phone Nokia3310";
	}
}
