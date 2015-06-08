package com.tyshchenko.training.java.oop.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * Created by ol on 07.06.2015.
 */
public class ThreadCountTime {
    public static void main(String[] args) throws IOException {
        MyThread myThread = new MyThread("TimeCounter");
        myThread.start();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter 'stop' to stop thread");
            String input = br.readLine();
            if (input.equals("stop")){
                System.out.println("Interrupting thread...");
                myThread.interrupt();
                break;
            }
        }
    }

    public static class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (!isInterrupted()) {
                SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
                System.out.println("Time is " + time.format(new Date()));
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
