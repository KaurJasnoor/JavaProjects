package Java_Assignments;

public class MaxEleArray {
    public static void main(String[] args){
        int[] arr = {10,5,30,45,35};
        int max = arr[0];
        for (int i=0; i< arr.length; i++){
            if (max < arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
