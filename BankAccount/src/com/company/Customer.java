package com.company;

public class Customer {
    private String name;
    private String emailAddress;
    private String phoneNumber;

    public Customer(String name, String emailAddress, String phoneNumber) {
        System.out.println("New customer created!");
        this.name = name;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name.trim();
        System.out.println("Name set to " + this.name + " successfully!");
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        if(emailAddress.contains("@")) {
            this.emailAddress = emailAddress;
            System.out.println("Email set to " + emailAddress + " successfully!");
        }
        else
            System.out.println("The email address " + emailAddress + " is not valid!");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
            System.out.println("Phone number set to " + phoneNumber + " successfully!");
        }
        else
            System.out.println("The phone number must have exactly 10 digits!");
    }
}
