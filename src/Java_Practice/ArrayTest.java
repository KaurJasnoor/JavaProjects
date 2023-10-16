package Java_Practice;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args){

       // int[] arr = {10,20,30,40,50}; // one way to declare an array
        //Second way to declare an array
        int[] arr = new int[5];
        /*arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;*/

        //getting user input for declaring elements of an array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        //accessing elements of an array
        /*for (int i=0; i < arr.length; i++){
           System.out.println(arr[i]);
        }*/

        //enhance for loop or foreach loop for printing element of array
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
