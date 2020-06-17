package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int numbers[] = {5,4,1,8,2};
        insertionSort(numbers);
    }
    public static void insertionSort(int arr[]){
        int temp;
        for (int i = 1; i < arr.length ; i++) {
            System.out.println("ITER : "+i+"\t"+Arrays.toString(arr));
            for (int j = i; j >0 ; j--) {
                System.out.print("   " + arr[j]+"<"+arr[j-1]+"\t");
                if(arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                System.out.print("\t"+Arrays.toString(arr));
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}

