package com.company;

public class Main {

    public static void main(String[] args) {
        Customer me = new Customer("Pelle Razvan", "my@email.com", "0712345678");

        me.setName("   Razvan Petru  ");
        me.setEmailAddress("myEmail");
        System.out.println("The previous email is invalid, so the email is still " + me.getEmailAddress());
        me.setPhoneNumber("0789123456");
        System.out.println();

        BankAccount myAccount = new BankAccount("12345", 0, me);

        myAccount.deposit(100);
        myAccount.withdraw(70);
        myAccount.withdraw(50);
        myAccount.withdraw(30);
    }
}
