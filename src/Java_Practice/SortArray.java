package Java_Practice;

public class SortArray {
    public static void main(String[] args){
        int[] arr = {10, -20, 43, 435, 232, 43, 56};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                int temp = arr[i];
                if(arr[i] > arr[j]){
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }

        }

        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
