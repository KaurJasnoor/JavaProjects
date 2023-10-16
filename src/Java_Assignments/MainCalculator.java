package Java_Assignments;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    CalculatorUsingMethods cal = new CalculatorUsingMethods();
    System.out.println("Welcome to my Calculator !!! ");
        int choice;
        do {
            System.out.println("Main Menu");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Press 1 : Addition");
            System.out.println("Press 2 : Subtraction");
            System.out.println("Press 3 : Multiplication");
            System.out.println("Press 4 : Quit");
            System.out.println("+++++++++++++++++++++++");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: cal.addition();
                case 2: cal.subtraction();
                case 3: cal.multiply();
                /*case 4: {
                    System.out.println("++++++++++++++++++++++++++++++++++++");
                    System.out.println("Thanks for using my Calculator: )");
                    System.out.println("++++++++++++++++++++++++++++++++++++");
                }*/
                default:
                    System.out.println("++++++++++++++++++++++++++++++++++++");
                    System.out.println("Ops!! Invalid choice. Please try again.");
                    System.out.println("++++++++++++++++++++++++++++++++++++");
            }
        } while (choice != 4);

        sc.close();



    }

}




