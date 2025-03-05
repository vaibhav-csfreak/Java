package com.vaibhav.java.votingMultithreading;

public class CongressVote implements Runnable{
    @Override
    public void run() {
        for(;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Congress");
            Thread.yield();     //Making thread execution very random
        }
    }
}
