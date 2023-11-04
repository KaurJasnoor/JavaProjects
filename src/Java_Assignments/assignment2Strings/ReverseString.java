package Java_Assignments.assignment2Strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        //Method # 1
        /*String s = "I am computer programmer";
        System.out.println(s);
        System.out.println(" ");
        char[] ch = s.toCharArray();
        for (int i = ch.length-1; i >=0; i--) {
            System.out.print(ch[i]);
        }*/

        //Method # 2
        String string = "Jasnoor";
        char[] chars = string.toCharArray();
        System.out.println("Original String: "+ Arrays.toString(chars));
        int count = 0;
        int last = string.length()-1;
        while (count < last ){
            char temp = chars[count];
            chars[count] = chars[last];
            chars[last] = temp;
            count++;
            last--;
        }
        System.out.println(" ");
        System.out.println("Reverse String: "+ Arrays.toString(chars));

    }
}
