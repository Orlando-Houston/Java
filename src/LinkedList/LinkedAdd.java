package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedAdd {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<> ();
        //Adding elements to the Linked List
        list.add ("Stove ");
        list.add ("Charles ");
        list.add ("Rambo ");
        list.add ("Negan ");
        list.add ("Rick ");
        //Removing First Element
        //Same as list.remove(0)
        System.out.println (list);
        list.removeFirst ();
        //removing last element
        list.removeLast ();
        System.out.println (list);


        //Iterating LinkedList
        Iterator<String>iterator=list.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ()+" ");
        }
        //removing 2nd element, index starts with 0 list.remove(1)
        System.out.println ("\nAfter removing second element: ");
        //Iterating linkedList again
        Iterator<String>iterator2=list.iterator ();
        while (iterator2.hasNext ()){
            System.out.println (iterator2.next ()+" ");

        }

         
    }
}
