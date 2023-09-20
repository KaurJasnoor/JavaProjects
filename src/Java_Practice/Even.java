package Java_Practice;

import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0) continue;{
            System.out.println(i);
            sum = sum + i;
             }
        }
        System.out.println("Sum of Even numbers are : " + sum);
    }

}
