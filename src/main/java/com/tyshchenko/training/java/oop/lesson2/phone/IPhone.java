package com.tyshchenko.training.java.oop.lesson2.phone;

/**
 * @author Alexander Tyshchenko.
 */
public class IPhone extends Phone {
	int smsCount;
	int callCount;
	public IPhone() {
		System.out.println("IPhone constructor");
		callCount = 0;
		smsCount = 0;
		touch = true;
		hasWifi = true;
		screenSize = 3;
	}

	@Override
	public void countCalls() {
		System.out.println("iPhone, Amount of calls = "+ callCount);
	}

	@Override
	public void countSms() {
		System.out.println("iPhone, Amount of smses = "+ smsCount);
	}

	@Override
    public final void call(String number) {
		callCount++;
		System.out.println("IPhone class is calling " + number);
	}
	
	@Override
	public void sendSMS(String number, String message) {
		smsCount++;
		System.out.println("IPhone class is sending sms " + message + " to " + number);	
	}
}
