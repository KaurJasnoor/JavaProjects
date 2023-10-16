package Java_Assignments;
import java.util.Scanner;

public class CalculatorUsingMethods {
    Scanner scanner = new Scanner(System.in);
    public void addition() {
        int choice;
        char choiceAdd;
        do {
            System.out.println("Lets do addition.");
            System.out.println("Do you want to add 2 numbers or 3 numbers ? ");
            System.out.println("Press 1: Add Two Numbers");
            System.out.println("Press 2: Add Three Numbers");
            System.out.println("Press 3 for exiting to Main Menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("!!! Add two numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        double sum = num1+num2;
                        System.out.println("Sum of  " + num1 + "  and  " + num2 + "  is  " + sum);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceAdd = scanner.next().toUpperCase().charAt(0);
                    } while (choiceAdd != 'N');break;
                case 2:
                    do {
                        System.out.println("!!! Add Three numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Enter the Third Number: ");
                        double num3 = scanner.nextDouble();
                        double sum = num1+num2+num3;
                        System.out.println("Sum of  " + num1 + "  ,  " + num2 + "and" + num3 + "  is: " + sum);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceAdd = scanner.next().toUpperCase().charAt(0);
                    } while (choiceAdd != 'N');

                case 3:
                    System.out.println("Exiting to Main Menu");
                    break;
                default:
                    System.out.println("Invalid Choice! Please choose right option");
            }
            //choice = scanner.nextInt();
        } while (choice != 4);
    }

    public void subtraction() {
        int choice;
        char choiceSub;
        do {
            System.out.println("Lets do Subtraction.");
            System.out.println("Do you want to Subtract 2 numbers or 3 numbers ? ");
            System.out.println("Press 1 to perform subtraction of 2 number");
            System.out.println("Press 2 to perform subtraction of 3 number");
            System.out.println("Press 3 for exiting to Main Menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("!!! Subtract two numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        double sub = num1-num2;
                        System.out.println("Subtraction of  " + num1 + "  and  " + num2 + "  is  " + sub);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceSub = scanner.next().toUpperCase().charAt(0);
                    } while (choiceSub != 'N');
                    break;
                case 2:
                    do {
                        System.out.println("!!! Subtract Three numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Enter the Third Number: ");
                        double num3 = scanner.nextDouble();
                        double sub = num1-num2-num3;
                        System.out.println("Sum of  " + num1 + "  ,  " + num2 + "and" + num3 + "  is: " + sub);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceSub = scanner.next().toUpperCase().charAt(0);
                    } while (choiceSub != 'N');
                    break;
                case 3:
                    System.out.println("Exiting to Main Menu");
                    break;
                default:
                    System.out.println("Invalid Choice! Please choose right option");
            }
        } while (choice != 3);
    }
    public void multiply() {
        int choice;
        char choiceMul;
        do {
            System.out.println("Lets do Multiplication.");
            System.out.println("Do you want to multiply 2 numbers or 3 numbers ? ");
            System.out.println("Press 1 to perform multiplication of 2 number");
            System.out.println("Press 2 to perform multiplication of 3 number");
            System.out.println("Press 3 for exiting to Main Menu");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("!!! Multiply two numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        double mul = num1*num2;
                        System.out.println("Multiply of  " + num1 + "  and  " + num2 + "  is  " + mul);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceMul = scanner.next().toUpperCase().charAt(0);
                    } while (choiceMul != 'N');
                    break;
                case 2:
                    do {
                        System.out.println("!!! Multiply Three numbers !!!");
                        System.out.println("Enter the First Number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter the Second Number: ");
                        double num2 = scanner.nextDouble();
                        System.out.println("Enter the Third Number: ");
                        double num3 = scanner.nextDouble();
                        double mul = num1*num2*num3;
                        System.out.println("Multiply of  " + num1 + "  ,  " + num2 + "and" + num3 + "  is: " + mul);
                        System.out.println("Do you want to continue ? Press Y or N ");
                        choiceMul = scanner.next().toUpperCase().charAt(0);
                    } while (choiceMul != 'N');
                    break;
                case 3:
                    System.out.println("Exiting to Main Menu");
                    break;
                default:
                    System.out.println("Invalid Choice! Please choose right option");
            }
        } while (choice != 3);
    }


}









