package com.company;

public class BankAccount {
    private String number;
    private float balance;
    public Customer customer;

    public BankAccount(String number, float balance, Customer customer) {
        System.out.println("New Bank Account created!");
        this.number = number;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(float funds) {
        float newBalance = balance + funds;
        setBalance(newBalance);
        System.out.println("Deposit of " + funds + " successful. New balance: " + balance);
    }

    public float withdraw(float funds) {
        if(funds <= balance) {
            float newBalance = balance - funds;
            setBalance(newBalance);
            System.out.println("Withdrawal of " + funds + " was accepted. Remaining balance: " + balance);
            return funds;
        } else {
            System.out.println("Only " + balance + " available, cannot withdraw " + funds);
            return 0;
        }
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        if(number.length() == 4) {
            this.number = number;
            System.out.println("Account number set to " + number + " successfully!");
        }
        else
            System.out.println("The account's number must have 4 digits!");
    }

    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        if(balance >= 0)
            this.balance = balance;
    }
}
