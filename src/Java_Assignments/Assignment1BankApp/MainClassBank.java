package Java_Assignments.Assignment1BankApp;

import javax.print.CancelablePrintJob;
import java.util.Scanner;

public class MainClassBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankApp bankApp = new BankApp();
        char option;
        do {
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("Main Menu");
            System.out.println(" ");
            System.out.println("a. Check Account Balance");
            System.out.println("b. Make a Deposit");
            System.out.println("c. Make a Withdrawal");
            System.out.println("d. Print Account Summary");
            System.out.println("e. Exit");
            System.out.println("+++++++++++++++++++++++++++");
            System.out.println("Please choose one of the above options: ");
            char choice = scanner.next().charAt(0);
            if (choice == 'a'){
                bankApp.checkingBalance();
            }
            if(choice == 'b'){
                bankApp.deposit();
            }
            if(choice == 'c'){
                bankApp.withdrawal();
            }
            if(choice == 'd'){
                bankApp.printSummary();
            }
            if(choice == 'e'){
                System.out.println("Exit");
                break;
            }
            else{
                System.out.println("Sorry!!! Wrong choice, Please try again ");
            }
            System.out.println("Do you want to continue? Y/N :");
            option = scanner.next().charAt(0);
        }while(option == 'Y');
    }
}
