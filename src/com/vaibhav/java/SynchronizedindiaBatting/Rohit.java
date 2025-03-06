package com.vaibhav.java.SynchronizedindiaBatting;

public class Rohit implements Runnable{
    private Runs runs;
    public Rohit(Runs runs){
        this.runs = runs;
    }
    @Override
    public void run() {
        for(int i=0;i<150;i++){
            runs.oneRun();
        }
        for(int i=0;i<100;i++){
            runs.OtherRun();
        }
    }
}
