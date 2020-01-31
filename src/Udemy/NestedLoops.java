package Udemy;

import java.util.Arrays;

public class NestedLoops {
    public static void main(String[] args) {
        for (int hours=1;hours<=6;hours++){
            for (int minutes=0;minutes<60;minutes++){
           //     System.out.println (hours+":"+minutes);
            }
        }
        int[][]myArray={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println (myArray);
        System.out.println (Arrays.toString (myArray));

        OUTER:
        for (int[] rowArray:myArray){
            INNER:
            for (int i=0;i<rowArray.length;i++){
                System.out.print
                        (rowArray[i]+" ");
            }
            System.out.println ();
        }
    }
}
