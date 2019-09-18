package Collections.LinkedList;
import java.util.LinkedList;

public class RemoveSpecific {
    public static void main(String[] args) {

        // Create a Collections.LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Add elements to Collections.LinkedList
        linkedlist.add("Item1");
        linkedlist.add("Item2");
        linkedlist.add("Item3");
        linkedlist.add("Item4");
        linkedlist.add("Item5");

        // Displaying Elements before remove
        System.out.println("Before SubjectHeadings.Remove:");
        for(String str: linkedlist){
            System.out.println(str);
        }

        // Removing "Item4" from the list
        linkedlist.remove("Item4");

        // Collections.LinkedList elements after remove
        System.out.println("\nAfter SubjectHeadings.Remove:");
        for(String str2: linkedlist){
            System.out.println(str2);
        }
    }
}
