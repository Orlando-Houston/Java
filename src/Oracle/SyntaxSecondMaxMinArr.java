package Oracle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SyntaxSecondMaxMinArr {
    public static void main(String[] args) {
        //easy way    second largest number
        int[]numArray={12,13,12,15,0,-1};
        Arrays.sort (numArray);
        int min=numArray[0];
        int max=numArray[numArray.length-1];
        System.out.println (numArray[numArray.length-2]);
        System.out.println ("Min is=" +min+ "and max=" +max);




        //more efficient way
        int[]array={1000,200,222,11};
        int largest=array[0];
        int secondLargest=0;

        for(int i=0;i<array.length;i++){
            if (array[i]>largest){
                secondLargest=array[i];

            }
            else if (array[i]>secondLargest&&array[i]!=largest){
                secondLargest=array[i];

            }
        }
        System.out.println ("The largest number="+largest+"and secondLargest="+secondLargest);


     int smallest=0;
     int bigger=0;
     for (int i=0;i<numArray.length;i++){
         if (numArray[i]>bigger){
             bigger=numArray[i];
         }
         else {
             smallest=numArray[i];
         }
     }
         System.out.println (smallest);
        System.out.println (bigger);
    }
}
