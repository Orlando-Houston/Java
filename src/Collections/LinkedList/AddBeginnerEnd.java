package Collections.LinkedList;
import java.util.LinkedList;

public class AddBeginnerEnd {
    public static void main(String[] args) {
        // Creating Collections.LinkedList of String Elements
        LinkedList<String> linkedlist = new LinkedList<String>();

        //Populating it with String values
        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");

        //Displaying Collections.LinkedList elements
        System.out.println(linkedlist);

        //Adding an element at the beginning
        linkedlist.addFirst("FIRST");

        //Displaying the List after addition
        System.out.println(linkedlist);

        //Adding an element at the end of list
        linkedlist.addLast("LAST");

        //Displaying the final list
        System.out.println(linkedlist);
    }
}

