package Cours.Aug26;
import java.util.Arrays;

public class BubleSortExample {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        int temp=0;

        for(int i=0 ; i<arr.length ; i++){

            for(int j=1 ; j<arr.length ; j++){

                if(arr[j-1]>arr[j]){

                    temp = arr[j];

                    arr[j]=arr[j-1];

                    arr[j-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
