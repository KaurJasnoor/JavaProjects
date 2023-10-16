package Java_Practice;

public class NestedForLoopStars {
    public static void main(String[] args){
        //Outer Loop takes care how many Lines.
        for (int i = 5;  i>=0 ; i--) {
            //Inner Loop takes care how many stars to print.
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 0;  i<=5 ; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
