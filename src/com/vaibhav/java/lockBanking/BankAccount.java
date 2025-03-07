package com.vaibhav.java.lockBanking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining Balance: " + balance);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (RuntimeException | InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println("INTERNAL SERVER ERROR. Please try again after sometime");
        }
    }
}
