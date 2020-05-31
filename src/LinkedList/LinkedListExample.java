package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        /*Linked list declaration*/
        LinkedList<String>linkedList=new LinkedList<String> ();
        /*add string element is used for addding
        * the elements to the linked list*/
        linkedList.add ("L");
        linkedList.add ("T ");
        linkedList.add ("U ");
        linkedList.add ("N ");

        System.out.println (linkedList);



        /*Display linked list content*/
        System.out.println ("Linked List Content:"+linkedList);

        /*Add first element and last element*/
        linkedList.addFirst ("A");
        linkedList.addLast ("~");
        System.out.println (linkedList);

        /*This is how to get and set values*/
        Object firstVar=linkedList.get (0);
        System.out.println ("First element"+firstVar);

        linkedList.set (0," E"+firstVar);
        System.out.println ("First element"+firstVar);

        Object firstVar1=linkedList.get (0);
        System.out.println ("First element after uptade by set method"+firstVar1);


        /*Remove first and last element*/
        linkedList.removeFirst ();
        linkedList.removeLast ();
        System.out.println ("Linked List after deletion of first and last element"+linkedList);
        /* Add to a position and remove from a position*/
        linkedList.add (0,"A");
        linkedList.remove (2);
        System.out.println ("File content"+ linkedList);







    }
}
