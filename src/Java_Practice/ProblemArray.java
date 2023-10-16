package Java_Practice;

public class ProblemArray {
    public static void main(String[] args){
        int[] arr = {2,3,5,10,20,3,5,45,23,3,25,6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==3 && arr[i+1] ==5){
                    arr[i+1] =0;
                }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
