package Collections.LinkedList;
import java.util.LinkedList;

public class CheckLinkedList {
    public static void main(String[] args) {

        // Creating Collections.LinkedList of String Elements
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Populating it with String values
        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");

        // contains() method checks whether the element exists
        if (linkedlist.contains("CC")) {
            System.out.println("Element CC is present in List");
        } else {
            System.out.println("List doesn't have element CC");
        }

        //Checking for element FF
        if (linkedlist.contains("FF")) {
            System.out.println("Element FF is present in List");
        } else {
            System.out.println("List doesn't have element FF");
        }
    }
}
//In this example we are gonna see how to check if a particular element exists in Collections.LinkedList using contains() method:
//
//public boolean contains(Object o): Returns true if this list contains the specified element.
// More formally, returns true if and only if this list contains at least one element e such that
// (o==null ? e==null : o.equals(e)).
