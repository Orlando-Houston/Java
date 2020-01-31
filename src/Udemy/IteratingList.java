package Udemy;

import java.util.*;

public class IteratingList {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<> ();
        numbers.add (2);
        numbers.add (4);
        numbers.add (6);

        for (int i=0;i<numbers.size ();i++){
           // System.out.println (i);
          //  System.out.println (numbers.get (i));//index
         //   System.out.println ("element at index"+i+"is"+numbers.get (i));
          //  numbers.remove (i);//index out of bounds

            for (Integer number:numbers){
                System.out.println ("number="+number);
              //  numbers.remove (2);//concurrent modification

            }//hasnext return boolean
            for (Iterator<Integer> iterator=numbers.iterator ();iterator.hasNext ();){
                Integer number=iterator.next ();
                System.out.println (number);
                iterator.remove ();

            }
            System.out.println (numbers);

            numbers.addAll (Arrays.asList (1,2,3,4,5,6));
            for (ListIterator<Integer> listIterator=numbers.listIterator (3);listIterator.hasPrevious ();){
                System.out.println (listIterator.previous ());
                listIterator.remove ();
            }
            System.out.println (numbers);

        }
    }
}
