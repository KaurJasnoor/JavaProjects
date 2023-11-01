package Java_Practice.Oct24.ExceptionDemo;

import java.util.Scanner;

public class Bank {
    double balance;

    public double deposit(double deposit){
    balance += deposit;
    return balance;
    }

    public double withdraw(double withdraw) throws InsufficientBalanceException {
        if (withdraw > balance){
            throw new InsufficientBalanceException("Sorry!!! You don't have enough funds in your account.");
        }else{
            balance = balance - withdraw;
        }

        return balance;
    }
}

