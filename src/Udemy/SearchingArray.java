package Udemy;

import Collections.HashMap.Sort;

import java.util.Arrays;

public class SearchingArray {
    public static void main(String[] args) {
             //  index 0,1,2,3,4
        int[] numbers={1,3,5,6,7};
        //binarysearch comprise include contain all data typs
        System.out.println (Arrays.binarySearch (numbers,2));
        System.out.println (Arrays.binarySearch (numbers,5));
        System.out.println (Arrays.binarySearch (numbers,7));
        System.out.println (Arrays.binarySearch (numbers,1));
        System.out.println (Arrays.binarySearch (numbers,3));
        System.out.println (Arrays.binarySearch (numbers,6));
        System.out.println (Arrays.binarySearch (numbers,4));


        int[]notSortedNumbers={5,4,10,8,6};
        Arrays.sort (notSortedNumbers);

        System.out.println (Arrays.toString (notSortedNumbers));
        System.out.println (Arrays.binarySearch (notSortedNumbers,5));
        System.out.println (Arrays.binarySearch (notSortedNumbers,8));

    }
}
