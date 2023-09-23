package Java_Assignments;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int myLuckyNumber = 13;

        System.out.println("Enter a number : ");
        int guess;
        while ((guess = scanner.nextInt()) != myLuckyNumber) {
            System.out.println("Sorry, Try your luck again: ");
        }
            System.out.println("Great!," + guess + " is your lucky number.");
    }
}
