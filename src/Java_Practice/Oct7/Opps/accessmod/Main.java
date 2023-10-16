package Java_Practice.Oct7.Opps.accessmod;

import Java_Practice.Mobile;

public class Main {
    public static void main(String[] args) {
        //class Mobile1
        Mobile1 m1 = new Mobile1();
        System.out.println("Brand of Mobile1 is: "+ m1.getBrand());
        System.out.println("Color of Mobile1 is: "+ m1.getColor());
        System.out.println("Screen Size of Mobile1 is: "+ m1.getScreenSize());
        System.out.println("Memory of Mobile1 is: "+ m1.getMemory());



        //class Mobile2
        Mobile2 m2 = new Mobile2();
        String result1 = m2.getBrand("Dell");
        System.out.println("Brand is: " +result1);
        /*String result2 = m2.getColor("Black");
        System.out.println("Color is: " +result2);
        int result3 = m2.getScreenSize(5);
        System.out.println("Screen Size is: " +result3);
        int result4 = m2.getMemory(256);
        System.out.println("Memory is: " +result4);*/

    }
}
