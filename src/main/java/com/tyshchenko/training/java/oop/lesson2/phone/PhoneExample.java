package com.tyshchenko.training.java.oop.lesson2.phone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Tyshchenko.
 */
public class PhoneExample {

	static ArrayList<Phone> phones = new ArrayList<>();

	public static void main(String[] args) {
		// Phone p = new Phone();
		
		Nokia3310 nokia = new Nokia3310();
		System.out.println("Nokia3310 screent size: " + nokia.getScreenSize());
		nokia.call("123-45-67");
		nokia.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone iphone = new IPhone();
		System.out.println("IPhone screent size: " + iphone.getScreenSize());
		iphone.call("123-45-67");
		iphone.sendSMS("567-78-89", "text message");
		
		System.out.println("----------------------------------");
		
		IPhone5 iphone5 = new IPhone5();
		System.out.println("IPhone screent size: " + iphone5.getScreenSize());
		iphone5.call("123-45-67");
		iphone5.call("523-34-23");
		iphone5.sendSMS("567-78-89", "text message");

		System.out.println("-----------------------------------");

		SamsungS4 samsungS4 = new SamsungS4();
		System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
		samsungS4.call("323-32-25");
		samsungS4.sendSMS("434-36-34", "text message");

		//_________________________________________________

         iphone5.countCalls();
		iphone5.countSms();

		samsungS4.countCalls();
		samsungS4.countSms();

        nokia.countSms();
		nokia.countCalls();

		//_________________________________________________
		phones.add(nokia);
		phones.add(iphone5);
		phones.add(samsungS4);

		int num = 643;
		nokia.call(num);

		Phone foundPhone = findPhone(num);
		if (foundPhone != null)
			foundPhone.answer();
	}

	    public static Phone findPhone(int num) {
			Phone result = null;
			for (int i = 0; i < phones.size(); i++) {
				if (num == phones.get(i).getNumber()) {
					result = phones.get(i);
					System.out.println("Phone with this number is found - "+phones.get(i).toString());
					break;
				}

			}

			if (result == null)
				System.out.println("No such phone number");
			return result;
		}


	}

