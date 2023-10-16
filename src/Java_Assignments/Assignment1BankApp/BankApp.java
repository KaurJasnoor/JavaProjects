package Java_Assignments.Assignment1BankApp;

import java.util.Scanner;

public class BankApp {
    public String welcome(){
        System.out.println("Welcome to the Banking System Simulator");
        System.out.println("Your current balance is : $1000");
        return null;
    }
    public void mainMenu(){
        System.out.println("a. Check Account Balance");
        System.out.println("b. Make a Deposit");
        System.out.println("c. Make a Withdrawal");
        System.out.println("d. Print Account Summary");
        System.out.println("e. Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you input");
        String input = scanner.next();
    }
    public static void intialBalance(int intibalance){
        return;
    }
    public void checkAccountBalance(){
        System.out.println("Your Account Balance is : $" + intialBalance());
    }
    private String intialBalance() {
        return null;
    }


}
