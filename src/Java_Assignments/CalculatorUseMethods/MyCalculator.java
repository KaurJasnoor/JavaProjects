package Java_Assignments.CalculatorUseMethods;

import java.util.Scanner;

public class MyCalculator {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, num3;
    public int add(int a, int b){
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of  " + num1 + "  and  " +  num2  + "  is  " + sum);
        return sum;
    }
    public int add(int x, int y, int z){ //Method Overloading
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        System.out.println("Enter the Third Number ");
        num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        System.out.println("Sum of  " + num1 + "  and  " +  num2  + "  and  " +  num3  + "  is : " + sum);
        return sum;
    }
    public int sub(int a, int b){
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        int sub = num1 - num2;
        System.out.println("Subtration of  " + num1 + "  and  " +  num2  + "  is  " + sub);
        return sub;
    }
    public int mul(int a, int b){
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        int mul = num1 * num2;
        System.out.println("Multiplication of  " + num1 + "  and  " +  num2  + "  is  " + mul);
        return mul;
    }
    public int div(int a, int b){
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        int div = num1 / num2;
        System.out.println("Division of  " + num1 + "  and  " +  num2  + "  is  " + div);
        return div;
    }
    public double mod(double a, double b){
        System.out.println("Enter the First Number ");
        double num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        double mod = num1 % num2;
        System.out.println("Modules of  " + num1 + "  and  " +  num2  + "  is  " + mod);
        return mod;
    }

}
