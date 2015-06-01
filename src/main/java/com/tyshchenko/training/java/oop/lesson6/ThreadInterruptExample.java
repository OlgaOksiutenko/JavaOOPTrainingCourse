package com.tyshchenko.training.java.oop.lesson6;

/**
 * @author Alexander Tyshchenko.
 */
public class ThreadInterruptExample {

    public static void main(String[] args) {
        CounterThread counter = new CounterThread("MyThreadCounter");
        counter.start();

        try {
            Thread.sleep(5000);
            counter.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static final class CounterThread extends Thread {

        public CounterThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            int x = 0;
            int Min = 1;
            int Max = 20;
            while (!isInterrupted()) {
                System.out.println("Random number from 1 to 20 is  " + (Min+(int)(Math.random()*((Max - Min)+1))) + " : " + x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

}