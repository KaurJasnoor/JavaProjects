package Java_Practice.Oct21.Encapsulation;

import java.util.Scanner;

public class Bank {
    private String accountHolderName;
    private String accountType;
    private String accountNumber;
    private double accountBalance;
    //double withdrawAmt;
    Scanner scanner = new Scanner(System.in);

    //Constructor
    public Bank(String accountHolderName, String accountType, String accountNumber, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public Bank() {

    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void withdraw(){
        System.out.println("Enter an Amount to withdraw: ");
        double amount = scanner.nextDouble();
            if (amount <= 0) {
                System.out.println("Enter Valid Amount");
            }

        else if(amount < accountBalance){
            accountBalance -= amount;
            System.out.println("You have withdrawn : $"+amount);
            System.out.println("New Balance is : $"+accountBalance);
        }
        else {
            System.out.println("Sorry! You are out of funds.");
        }
        //Using Exceptions:

    }
    public void deposit(){
        System.out.println("Enter Amount to Deposit: ");
        double amount = scanner.nextDouble();
        if(amount <=0){
            System.out.println("Invalid Amount");
        }
        else {
            accountBalance += amount;
            System.out.println("New Balance : $"+accountBalance);
        }
    }
    public void checkBalance(){
        System.out.println("Checking Balance...");
        System.out.println("Current Balance is : $"+accountBalance);
    }
    public void statements(){
        System.out.println("Printing Statements....");
    }
}
