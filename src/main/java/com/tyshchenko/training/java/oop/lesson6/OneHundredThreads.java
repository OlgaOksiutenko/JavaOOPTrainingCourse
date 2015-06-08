package com.tyshchenko.training.java.oop.lesson6;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ol on 07.06.2015.
 */
public class OneHundredThreads {
    public static void main(String[] args) {
        ArrayList<Thread> list = new ArrayList<Thread>();
        for (int i = 0; i <100 ; i++) {

            MyThread thread = new MyThread("Counter", i);
            thread.start();
            list.add(thread);
        }

        System.out.println("stopping all threads...");
        for(Thread t: list){
            t.interrupt();
        }
        System.out.println("Done");
    }

    public static class MyThread extends Thread {
        private int _i;

        public MyThread(String name, int i) {
            super(name);
            _i = i;
        }

        @Override
        public void run() {
            System.out.println("Thread is: " + _i );
            while (!isInterrupted()) {
            }
        }

    }
}
