package Java_Practice;

import java.util.Scanner;

public class TernaryOp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First Number: ");
        System.out.println("Enter a Second Number: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String result = number1 > number2 ? "It's Positive Number" : "It's Negative Number";
        System.out.println(result);
    }
}
