package Java_Practice.Oct21.Encapsulation;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        char option;
        int choice;
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(" ", "Saving Account", "123456789",0.00);
        Scotiabank scotiabank = new Scotiabank("Noor", "Basic Plus", "987654321", 500.00);
        System.out.println("******************************");
        System.out.println("Choose your Bank:");
        System.out.println("1 : Bank");
        System.out.println("2 : Scotiabank");
        choice = scanner.nextInt();
        switch (choice) {
            case 1: // Bank
            bank.setAccountHolderName("Jasnoor Kaur");
            System.out.println("Account Holder Name: " + bank.getAccountHolderName());
            System.out.println("Account Type is: " + bank.getAccountType());
            System.out.println("Account Number: " + bank.getAccountNumber());
            System.out.println("Account Balance: " + bank.getAccountBalance());
            System.out.println("******************************");
            do {
                System.out.println("Press 1 for Deposit");
                System.out.println("Press 2 for Withdraw");
                System.out.println("Press 3 for Check Balance");
                System.out.println("Press 4 for Statements");
                System.out.println("Press 5 to Exit");
                System.out.println("Enter your input: ");
                System.out.println(" ");
                int input = scanner.nextInt();
                if (input == 1) {
                    bank.deposit();
                } else if (input == 2) {
                    bank.withdraw();
                } else if (input == 3) {
                    bank.checkBalance();
                } else if (input == 4) {
                    bank.statements();
                } else if (input == 5) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    System.out.println("Sorry!!! Wrong choice, Please try again ");
                }
                System.out.println("Do you want to continue? Y/N :");
                option = scanner.next().charAt(0);
            } while (option == 'Y');
            case 2:
                System.out.println("Account Holder Name: " + scotiabank.getAccountHolderName());
                System.out.println("Account Type is: " + scotiabank.getAccountType());
                System.out.println("Account Number: " + scotiabank.getAccountNumber());
                System.out.println("Account Balance: " + scotiabank.getAccountBalance());
                System.out.println("******************************");
        }




    }



}
