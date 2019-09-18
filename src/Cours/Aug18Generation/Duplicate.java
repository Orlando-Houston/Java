package Cours.Aug18Generation;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {

    public static void removeDuplicates(ArrayList<Integer>arr) {
        ArrayList<Integer> newArr=new ArrayList<>();
        for (int element:arr) {
            if (!newArr.contains(element)){  //filter
                newArr.add(element);
            }

        }
        System.out.println(newArr);
    }

    public static void main(String[] args) {
        ArrayList<Integer>myList=new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,6,6,7,8));
        removeDuplicates(myList);
    }
}
