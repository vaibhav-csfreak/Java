package bank;

public class Customer {
    String name;
    int age;
    long accountNumber;
    double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer(String name, int age, long accountNumber, double balance){
        this.setName(name);
        this.setAge(age);
        this.setAccountNumber(accountNumber);
        this.setBalance(balance);
    }

    public void setBalance(double balance) {
        if(balance<0){
            this.balance = 0;
        }
        else{
            this.balance = balance;
        }
    }

    public void withdraw(double debitAmount){
        if(debitAmount>this.getBalance()){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Debit Amount: "+ debitAmount);
            this.setBalance(this.getBalance()-debitAmount);
            System.out.println("Remaining Balance: " + this.getBalance());
        }
    }

    public void deposit(double creditAmount){
        this.setBalance(this.getBalance()+creditAmount);
        System.out.println("Account Balance: "+ this.getBalance());
    }
}
