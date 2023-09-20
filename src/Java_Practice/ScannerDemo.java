package Java_Practice;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args){
      // int num1;
       // int num2;

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter the First Number ");
        num1 = scanner.nextInt();

        System.out.println("Enter the Second Number ");
        num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum of two number "+ sum);

        */

        //Below calculation using doule datatypes
        double num3;
        double num4;
        System.out.println("Enter the third Number ");
        num3 = scanner.nextDouble();

        System.out.println("Enter the fourth Number ");
        num4 = scanner.nextDouble();

        double sum2 = num3 + num4;
        System.out.println("Sum2 of two number "+ sum2);

        //Below calculation using float datatypes
        float num5;
        float num6;
        System.out.println("Enter the fifth Number ");
        num5 = scanner.nextFloat();

        System.out.println("Enter the sixth Number ");
        num6 = scanner.nextFloat();

        float sum3 = num5 + num6;
        System.out.println("Sum3 of two number "+ sum3);
    }
}
