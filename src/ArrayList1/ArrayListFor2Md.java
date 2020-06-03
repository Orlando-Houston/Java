package ArrayList1;

import java.util.ArrayList;

public class ArrayListFor2Md {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer> ();
        myList.add (4);
        myList.add (10);
        myList.add (50);

        //every single of them
         for (int i=0;i<myList.size ();i++){
          System.out.println (myList.get (i));

    }
        for (int element:myList){
            System.out.println (element);
        }
        int index=0;
        while(index<myList.size ()){
            System.out.println (myList.get (index));
            index++;
        }
    }
}
