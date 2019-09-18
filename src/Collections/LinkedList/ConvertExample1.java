package Collections.LinkedList;
import java.util.LinkedList;

public class ConvertExample1 {
    public static void main(String[] args) {

        //Creating and populating Collections.LinkedList
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Harry");
        linkedlist.add("Maddy");
        linkedlist.add("Chetan");
        linkedlist.add("Chauhan");
        linkedlist.add("Singh");

        //Converting Collections.LinkedList to Array
        String[] array = linkedlist.toArray(new String[linkedlist.size()]);

        //Displaying Array content
        System.out.println("Array Elements:");
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
//Converting Collections.LinkedList to array is very easy. You can convert a Collections.LinkedList of any type (such as double, String,
// int etc) to an array of same type. In this tutorial we will see an example of such type of conversion.
//
//Example
//Here we are converting a Collections.LinkedList of strings to String Array (Collections.LinkedList to String[]).
// At the end of the program we have mentioned how to convert a list of any other type such as double,
// int etc to corresponding array type.
