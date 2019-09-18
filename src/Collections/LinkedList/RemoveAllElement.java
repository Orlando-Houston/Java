package Collections.LinkedList;
import java.util.LinkedList;

public class RemoveAllElement {
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
        System.out.println("Before clear():");
        for(String str: linkedlist){
            System.out.println(str);
        }

        // Removing all the elements from Collections.LinkedList
        linkedlist.clear();

        // Collections.LinkedList elements after remove
        System.out.println("After clear():");
        for(String str2: linkedlist){
            System.out.println(str2);
        }
    }
}
