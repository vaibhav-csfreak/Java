package com.vaibhav.java.bankEncapsulation;

public class VsBank {
    public static void main(String[] args){
        Customer vaibhav = new Customer("Vaibhav", 24, 1234567890, 500000);
        vaibhav.withdraw(234);
        vaibhav.getBalance();
        vaibhav.withdraw(9090998);
        vaibhav.deposit(238794387);
        vaibhav.withdraw(987979898);
    }
}
