package Cours.Aug20;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftingElements {
    public static void shiftElements(ArrayList<Integer>arr,int left) {
        for (int i=0;i<left;i++){
            arr.remove(0);// index
        }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer>myArr=new ArrayList<Integer>(Arrays.asList(2,23,4,54,67,89,45,34));
        shiftElements(myArr,2);


    }
}
