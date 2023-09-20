package Java_Assignments;

import java.util.Scanner;

public class GradeAssignment1 {
    public static void main(String[] args){
        System.out.println("Enter you marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks>=0 && marks <=40){
            System.out.println("Fail");
        }
        else if (marks>40 && marks<=60 ){
            System.out.println("B Grade");
        }
        else if (marks>60 && marks<=80 ){
            System.out.println("B+ Grade");
        }
        else if (marks>80 && marks<=90 ){
            System.out.println("A Grade");
        }
        else if (marks>90 && marks<=99 ){
            System.out.println("A+ Grade");
        }
        else if (marks>99 && marks==100 ){
            System.out.println("Out of box");
        }
        else
            System.out.println("Invalid input...");
    }
}
