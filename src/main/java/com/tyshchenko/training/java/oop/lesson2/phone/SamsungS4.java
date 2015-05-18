package com.tyshchenko.training.java.oop.lesson2.phone;

/**
 * Created by ol on 17.05.2015.
 */
public class SamsungS4 extends Phone {
    int smsCount;
    int callCount;

    public SamsungS4() {
        System.out.println("Samsung S4 constructor");
        smsCount = 0;
        callCount = 0;
        hasWifi = true;
        screenSize = 5;
        number = 926;
    }

    @Override
    public void countCalls() {
        System.out.println("Samsung, Amount of calls = "+ callCount);
    }

    @Override
    public void countSms() {
        System.out.println("Samsung, Amount of smses = "+ smsCount);
    }

    @Override
    public void call(String number) {
        super.call(number);
        callCount++;
        System.out.println("SamsungS4 class is calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        smsCount++;
        String messageNew = message + " Hello";
        System.out.println(messageNew + " to " + number);
    }
    public String toString(){
        return "Phone Samsung S4";
    }
}
