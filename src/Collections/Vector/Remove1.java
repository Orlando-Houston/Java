package Collections.Vector;
import java.util.Vector;

public class Remove1 {
    public static void main(String[] args) {

        // Creating a Collections.Vector of Strings
        Vector<String> vector = new Vector<String>();

        //Adding elements to the Collections.Vector
        vector.add("C++");
        vector.add("Java");
        vector.add("Cobol");
        vector.add("C");
        vector.add("Oracle");

        System.out.println("Collections.Vector elements before remove(): ");
        for(int i=0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }

        // Removing 3rd element from Collections.Vector
        Object obj = vector.remove(2);

        System.out.println("\nElement removed from Collections.Vector is:");
        System.out.println(obj);

        System.out.println("\nCollections.Vector elements after remove():");
        for(int i=0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }
    }
}
//How to remove Collections.Vector elements using index in java example
//BY CHAITANYA SINGH | FILED UNDER: JAVA COLLECTIONS
//
//In this tutorial, we will learn how to remove elements from Collections.Vector using index. We will be using remove(int index)
// method of Collections.Vector class.
//
//public E remove(int index): Removes the element at the specified position in this Collections.Vector.
// Shifts any subsequent elements to the left (subtracts one from their indices). Returns the element that was removed
// from the Collections.Vector.
