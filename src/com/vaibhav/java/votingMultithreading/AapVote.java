package com.vaibhav.java.votingMultithreading;

public class AapVote extends Thread{
    @Override
    public void run(){
        for(;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Aap");
            Thread.yield();     //Making thread execution very random
        }
    }
}
