package Java_Practice.Oct28.Test;

import java.util.Scanner;

public class TestOct28 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n= scanner.nextInt();
        for(int i=1;i<=n;i++){ //i=3
            if(i%3==0 && i%5==0){  //fasle
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){ //true
                System.out.println("Fizz");
            }
            else if(i%5==0){ //false
                System.out.println("Buzz");
            }
            else {
                System.out.println(i); //1, 2, Fizz,
            }
        }
    }
}

