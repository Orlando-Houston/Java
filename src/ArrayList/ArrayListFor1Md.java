package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFor1Md {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(4);
        myList.add(10);
        myList.add(50);
      //  System.out.println (myList.size ());
        //every single of them
        for (int i=0;i<myList.size ();i++){
           System.out.println (myList.get (i));

        }
        System.out.println (myList);
    }
}
