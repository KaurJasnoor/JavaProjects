package Java_Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int limit = 10;
        System.out.println("Enter the number to Print the Table");
        /*for(int i = 1; i <= 10; ++i)
        {
            int result = num * i;
            System.out.println(result);
        }*/

        do {
            int result = num * i;
            System.out.println(result);
            i++;
        }
        while(i <= limit);

    }

}
