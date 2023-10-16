package Java_Practice;

import java.util.Scanner;

public class MainCalculatorClass {
    static char choice;
    static char choice1;
    public static void main(String[] args){
        do{
        System.out.println("Welcome to my Calculator !!! ");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");

        Calculator cal = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you input");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                do{
                System.out.println("Do you want to add 2 numbers or 3 numbers ? ");
                int option = scanner.nextInt();
                //calling methods add() and checking condition using ternary operator.
                int result =  (option == 2 ? cal.add(cal.num1, cal.num2) : cal.add(cal.num1, cal.num2, cal.num3));
                    System.out.println("Do you want to continue ? Press Y or N ");
                     choice = scanner.next().charAt(0);
                } while(choice != 'N');
                break;
            case 2:
                System.out.println("Coming soon....");
                break;
            default:
                System.out.println("Invalid Input");

        }
            System.out.println("Do you want to go to the main menu ? Press Y or N ");
            choice1= scanner.next().charAt(0);
        } while(choice1 != 'N');






        /*int sub = calculator.sub(50, 20);
        System.out.println("Subtraction is " + sub);

        int mul = calculator.mul(10, 20);
        System.out.println(mul);

        int div = calculator.div(10, 2);
        System.out.println(div);*/
    }
}
