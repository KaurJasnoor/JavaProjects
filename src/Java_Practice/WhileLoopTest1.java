package Java_Practice;

import java.util.Scanner;

public class WhileLoopTest1 {
    public static void main(String[] args){
        int sum = 0;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (i <= num){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of natural numbers are :"+ sum);
    }
}
