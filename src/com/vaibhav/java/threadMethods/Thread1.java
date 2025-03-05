package com.vaibhav.java.threadMethods;

public class Thread1 extends Thread{

    @Override
    public void run(){
        for (int i=5;i>0;i--){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String [] args) throws InterruptedException {
        Thread2 thread2 = new Thread2();
        Thread t1 = new Thread(thread2);
        Thread1 t2 = new Thread1();
        t1.start();
        t1.join();
        System.out.println("THREAD RUNNING OVER");
        t2.start();
//        t2.start();
    }
}
