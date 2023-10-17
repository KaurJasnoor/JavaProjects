package Java_Assignments.Assignment1BankApp;

import java.util.Scanner;

public class BankApp {
    Scanner scanner = new Scanner(System.in);
    double balance = 1000;
    int depositCount;
    double depositAmount;
    int withdrawCount;
    double withdrawAmount;
    public String welcome(){
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("!!! Welcome to the Banking System Simulator !!!");
        System.out.println(" ");
        System.out.println("Your current balance is : " + balance);
        return null;
    }

    public void checkingBalance(){
        System.out.println("Checking Account Balance....");
        System.out.println(" ");
        System.out.println("Your current available balance is : " + balance);
    }
    public void deposit(){
        System.out.println("Please enter the amount to deposit: ");
        double amount =scanner.nextDouble();
        if (amount <= 0){
            System.out.println("Invalid Amount!!!");
        }
        else{
            depositCount++;
            depositAmount += amount;
            balance += amount;
            System.out.println("Your New Balance is : " +balance);
        }
    }
    public void withdrawal(){
        System.out.println("Enter an Amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <=0){
            System.out.println("!!! Error !!! Withdraw amount is not valid, Try Again");
        }
        else if (amount <= balance){
            withdrawCount++;
            withdrawAmount += amount;
            balance -= amount;
            System.out.println("Your remaining balance is : " +balance);
        }
        else{
            System.out.println("Sorry !!! You do not have enough money to withdraw from this account.");
        }
    }
    public void printSummary(){
        System.out.println("Here is your Account Summary");
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("Current Balance: " +balance);
        System.out.println("Total no. of deposit: " +depositCount);
        System.out.println("Total Amount Deposited: " +depositAmount);
        System.out.println("Total no. of Withdrawals: " +withdrawCount);
        System.out.println("Total Amount Withdraw: " +withdrawAmount);
        System.out.println("+++++++++++++++++++++++++++");
    }
}
