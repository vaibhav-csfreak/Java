package com.vaibhav.java.threadMethods;

public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
