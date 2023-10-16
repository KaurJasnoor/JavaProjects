package Java_Assignments.CalculatorUseMethods;

import java.util.Scanner;

public class CalculatorMain {
    static char choice;
    static char choice1;
    public static void main(String[] args) {
        int option;
        int validOp;
        int numOp =0;
        do{
            System.out.println("!!! Welcome to my Calculator !!! ");
            System.out.println("++++++++++++++++++++++++++++++++++");
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Subtraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Division");
            System.out.println("Press 5 for Modules");
            System.out.println("++++++++++++++++++++++++++++++++++");
            MyCalculator cal = new MyCalculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter you choice: ");
            option = scanner.nextInt();
            validOp = (option>=1 && option<=5)? 1 : 0;

            if (validOp == 1) {
                switch (option) {
                    case 1: /****** Addition ******/
                        do {
                            System.out.println("Do you want to add 2 numbers or 3 numbers ? ");
                            numOp = scanner.nextInt();
                            //calling methods add() and checking condition using ternary operator.
                            int result =  (numOp == 2 ? cal.add(cal.num1, cal.num2) : cal.add(cal.num1, cal.num2, cal.num3));
                            System.out.println("Do you want to continue ? Press Y or N ");
                            choice = scanner.next().charAt(0);
                        } while (choice != 'N');
                        break;
                    case 2: /****** Subtraction ********/
                        do {
                            System.out.println("Lets do Subtraction !!! ");
                            //calling methods sub()
                            cal.sub(cal.num1, cal.num2);
                            System.out.println("Do you want to continue ? Press Y or N ");
                            choice = scanner.next().charAt(0);
                        } while (choice != 'N');
                        break;
                    case 3: /****** Multiplication ********/
                        do {
                            System.out.println("Lets do Multiplication !!! ");
                            //calling methods mul()
                            cal.mul(cal.num1, cal.num2);
                            System.out.println("Do you want to continue ? Press Y or N ");
                            choice = scanner.next().charAt(0);
                        } while (choice != 'N');
                        break;
                    case 4: /****** Division ********/
                        do {
                            System.out.println("Lets do Division !!! ");
                            //calling methods div()
                            cal.div(cal.num1, cal.num2);
                            System.out.println("Do you want to continue ? Press Y or N ");
                            choice = scanner.next().charAt(0);
                        } while (choice != 'N');
                        break;
                    case 5: /****** Modules ********/
                        do {
                            System.out.println("Lets do Modules !!! ");
                            //calling methods div()
                            cal.mod(cal.num1, cal.num2);
                            System.out.println("Do you want to continue ? Press Y or N ");
                            choice = scanner.next().charAt(0);
                        } while (choice != 'N');
                        break;
                }
            }else {
                System.out.println("Sorry!!! Wrong Choice");
            }
            System.out.println("Do you want to go to the main menu ? Press Y or N ");
            choice1= scanner.next().charAt(0);
        } while(choice1 != 'N');
    }
}
