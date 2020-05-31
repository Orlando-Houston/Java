package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElement {
    public static void main(String[] args) {
        //created a linkedlist
        LinkedList<String>linkedList=new LinkedList<String> ();
        //add elements to linkedList
        linkedList.add ("Houston");
        linkedList.add ("Orlando");
        linkedList.add ("New york");
        linkedList.add ("Itheca");
        linkedList.add ("Boston");

        System.out.println (linkedList);

        //adding new element at 5th position
        linkedList.add (4,"Ankara");
        System.out.println (linkedList);
        //iterating the list in forward direction
        System.out.println ("linkedList elements after addition:");
        Iterator it=linkedList.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next ());
        }

    }
}
