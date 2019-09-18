package Collections.Vector;
import java.util.Vector;

public class RemoveAll {
    public static void main(String[] args) {

        // Creating a Collections.Vector of Strings
        Vector<String> vector = new Vector<String>();

        //Adding elements to the Collections.Vector
        vector.add("C++");
        vector.add("Java");
        vector.add("Cobol");
        vector.add("C");
        vector.add("Oracle");

        System.out.println("Current size of Collections.Vector: "+vector.size());

        // Calling clear() method of Collections.Vector API
        vector.clear();

        System.out.println("Size of Collections.Vector after clear(): "+vector.size());
    }

}
//SubjectHeadings.Remove all elements from Collections.Vector in Java – Example
//BY CHAITANYA SINGH | FILED UNDER: JAVA COLLECTIONS
//
//In this example, we will see how to remove all the elements from a Collections.Vector. We will be using clear() method of Collections.Vector
// class to do this.
//public void clear(): Removes all of the elements from this Collections.Vector. The Collections.Vector will be empty after this method call.
//
//Example
//Here we are displaying the size of the Collections.Vector before and after calling clear() method. The steps are as follows:
//1) Create a Collections.Vector.
//2) Add elements to it.
//3) Call clear() method to remove all the elements.
