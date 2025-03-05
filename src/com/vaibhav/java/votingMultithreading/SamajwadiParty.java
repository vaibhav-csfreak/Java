package com.vaibhav.java.votingMultithreading;

public class SamajwadiParty implements Runnable{

    @Override
    public void run() {
        for(;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Samajwadi Party");
            Thread.yield();     //Making thread execution very random
        }
    }
}
