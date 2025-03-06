package com.vaibhav.java.SynchronizedindiaBatting;

public class Runs {
    private int runs = 0;
    public synchronized void oneRun(){      //Synchronized helps to run this function by only one thread at a time
        runs++;
    }
    public void OtherRun(){
        runs+=6;
        synchronized (this) {               //Another way to implement synchronized
            runs+=2;
        }
        runs+=3;
        runs+=4;
    }
    public int getScore(){
        return runs;
    }
}
