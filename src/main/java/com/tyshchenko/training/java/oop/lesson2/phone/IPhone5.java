package com.tyshchenko.training.java.oop.lesson2.phone;

/**
 * @author Alexander Tyshchenko.
 */
public class IPhone5 extends IPhone {

	int smsCount;
	int callCount;

	public IPhone5() {
		System.out.println("IPhone5 constructor");

		smsCount = 0;
		callCount = 0;
		screenSize = 4;
		number = 823;
	}

	/*@Override
	public void call(String number) {
		System.out.println("IPhone class is calling " + number);
	}*/
	
	@Override
	public void sendSMS(String number, String message) {
		super.sendSMS(number, message);
		smsCount++;
		System.out.println("IPhone5 class is sending sms " + message + " to " + number);	
	}

	public String toString(){
		return "Phone iPhone5";
	}
}
