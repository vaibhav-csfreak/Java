package com.vaibhav.java.indiaBatting;

public class Virat implements Runnable {
    private Runs runs;
    public Virat(Runs runs){
        this.runs = runs;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            runs.oneRun();
        }
        for(int i=0;i<100;i++){
            runs.OtherRun();
        }
    }
}
