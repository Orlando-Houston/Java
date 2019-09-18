package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListToArrayManual {
    public static void main(String[] args) {

        /*Collections.ArrayList declaration*/
        ArrayList<String> arraylist= new ArrayList<String>();

        /*Initialized Array*/
        String array[] = {"Text1","Text2","Text3","Text4"};

        /*array.length returns the current number of
         * elements present in array*/
        for(int i =0;i<array.length;i++)
        {

            /* We are adding each array's element to the Collections.ArrayList*/
            arraylist.add(array[i]);
        }

        /*Collections.ArrayList content*/
        for(String str: arraylist)
        {
            System.out.println(str);
        }
    }
}
/*
Method 3: Manual way of doing things
We can also add all the array’s element to the array list manually. Below example shows the logic of manual conversion.
 */
