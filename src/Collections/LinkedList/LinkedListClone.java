package Collections.LinkedList;
import java.util.LinkedList;

public class LinkedListClone {
    public static void main(String[] args) {

        // create a Collections.LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // Adding elements to the Collections.LinkedList
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");
        list.add("Element4");

        // Displaying Collections.LinkedList elements
        System.out.println("Collections.LinkedList elements: "+list);

        // Creating another list
        LinkedList<String> list2 = new LinkedList<String>();

        // Clone list to list2
        /* public Object clone(): Returns a shallow copy of this
         * Collections.LinkedList. (The elements themselves are not cloned.)
         */
        list2 = (LinkedList)list.clone();

        // Displaying elements of second Collections.LinkedList
        System.out.println("List 2 Elements: "+list2);
    }
}
