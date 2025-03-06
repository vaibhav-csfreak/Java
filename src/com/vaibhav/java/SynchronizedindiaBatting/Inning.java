package com.vaibhav.java.SynchronizedindiaBatting;

public class Inning {
    public static void main(String[] args){
        Runs runs = new Runs();
        Rohit t1 = new Rohit(runs);
        Virat t2 = new Virat(runs);
        Thread RThread = new Thread(t1);
        Thread VThread = new Thread(t2);
        RThread.start();
        VThread.start();
        try {
            RThread.join();
            VThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(runs.getScore());
    }

}
