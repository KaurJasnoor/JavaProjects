package Java_Assignments;

import java.util.Scanner;

public class SwitchCaseScannerDemo {
    public static void main(String[] args) {

        System.out.println("Welcome to my Java_Assignments.Calculator");
        System.out.println("Press 1 for Java_Practice.Addition");
        System.out.println("Press 2 for Java_Practice.Subtraction");
        System.out.println("Press 3 for Java_Practice.Multiplication");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you input");
        int input = scanner.nextInt();
        int num1;
        int num2;

        switch (input){
            case 1:
                System.out.println("Enter the First Number ");
                num1 = scanner.nextInt();
                System.out.println("Enter the Second Number ");
                num2 = scanner.nextInt();
                int sum = num1 + num2;
                System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case 2:
                System.out.println("Enter the First Number ");
                num1 = scanner.nextInt();
                System.out.println("Enter the Second Number ");
                num2 = scanner.nextInt();
                int sub = num1 - num2;
                System.out.println("Java_Practice.Subtraction of " + num1 + " and " + num2 + " is " + sub);
                break;
            case 3:
                System.out.println("Enter the First Number ");
                num1 = scanner.nextInt();
                System.out.println("Enter the Second Number ");
                num2 = scanner.nextInt();
                int mul = num1 * num2;
                System.out.println("Java_Practice.Multiplication  of " + num1 + " and " + num2 + " is " + mul);
                break;
            default:
                System.out.println("Invalid input...");
        }
    }
}
