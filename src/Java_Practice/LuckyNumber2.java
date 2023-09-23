package Java_Practice;

import java.util.Scanner;

public class LuckyNumber2 {
    public static void main(String[] args){
                Scanner luckyNum = new Scanner(System.in);
                // Generate the numbers
                int number = 47;
                int count = 5;
                int i, guess;
                System.out.println("Guess the number between 1 to 100 within 5 trials.");
                // Iterate over K Trials
                for ( i = 0; i < count; i++) {
                    System.out.println("Enter the number:");
                    // Take input for guessing
                    guess = luckyNum.nextInt();
                    // If the number is guessed
                    if (number == guess) {
                        System.out.println("Congratulations! You guessed the number.");
                        break;
                    }
                    /*else {
                        System.out.println("Try Again: ");
                    }*/
                    else if (number > guess
                            && i != count - 1) {
                        System.out.println("The number is greater than " + guess);
                    }
                    else if (number < guess
                            && i != count - 1) {
                        System.out.println("The number is less than " + guess);
                    }
                }
                if (i == count) {
                    System.out.println("Failed! to guess.");
                    System.out.println("The number was " + number);
                }
            }
}
