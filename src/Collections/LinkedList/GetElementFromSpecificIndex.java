package Collections.LinkedList;
import java.util.LinkedList;

public class GetElementFromSpecificIndex {
    public static void main(String[] args) {

        // Creating Collections.LinkedList of String Elements
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Populating it with String values
        linkedlist.add("AA");
        linkedlist.add("BB");
        linkedlist.add("CC");
        linkedlist.add("DD");
        linkedlist.add("EE");

        System.out.println("Collections.LinkedList Elements : ");
        //get(i) returns element present at index i
        for(int i=0; i < linkedlist.size(); i++){
            System.out.println("Element at index "+i+" is: "+linkedlist.get(i));
        }
    }
}
