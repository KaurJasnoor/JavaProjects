package Java_Practice;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    int num1, num2, num3;

    //int option;
    public int add(int a, int b){
        System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();
        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of  " + num1 + "  and  " +  num2  + "  is  " + sum);
        return sum;
    }
    public int add(int x, int y, int z){
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
    /*public int sub(int a, int b){
        int sub = a-b;
        return sub;
    }
    public int mul(int a, int b){
        int mul = a*b;
        return mul;
    }
    public int div(int a, int b){
        int div = a/b;
        return div;
    }*/
}
