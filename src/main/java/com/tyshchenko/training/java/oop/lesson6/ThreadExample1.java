package com.tyshchenko.training.java.oop.lesson6;

/**
 * @author Alexander Tyshchenko.
 */
public class ThreadExample1 {

    public static void main(String[] args) {
        MyThread thread = new MyThread("MyThread");
        thread.start();
    }

    private static final class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            System.out.println("Thread " + getName() + " is running");
        }
    }
}
