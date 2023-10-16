package Java_Practice;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String s1 = "pragra";
        //covert string into array
        char[] ch = s1.toCharArray();
        for (char e : ch) {
            System.out.print(" "+e);
        }
        System.out.println(" ");

        //reverse the string
        for (int i= ch.length-1; i>=0; i--){
            System.out.print(" "+ch[i]);
        }
        System.out.println(" ");
        //Uppercase
        String s2 = "welcome";
        String up = s2.toUpperCase();
        System.out.println(up);

        //charAT
        char c1 = s1.charAt(2);
        System.out.println(c1);


        //Lowercase
        String s3 = "EXCELLENT";
        String lc = s3.toLowerCase();
        System.out.println(lc);

        // compareTo Method
        String s4 = "Jass";
        String s5 = "Noor";
        int c = s4.compareTo(s5);
        System.out.println(c);



    }
}
