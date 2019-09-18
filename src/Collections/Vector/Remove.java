package Collections.Vector;
import java.util.Vector;

public class Remove {
    public static void main(String[] args) {
        // Creating a Collections.Vector of String Elements
        Vector<String> vector = new Vector<String>();

        //Adding elements to the Collections.Vector
        vector.add("Harry");
        vector.add("Steve");
        vector.add("Vince");
        vector.add("David");
        vector.add("Matt");

        System.out.println("Collections.Vector elements before remove(): ");
        for(int i=0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }

        // Removing Harry
        vector.remove("Harry");
        // Removing Matt
        vector.remove("Matt");

        System.out.println("\nCollections.Vector elements after remove(): ");
        for(int i=0; i < vector.size(); i++)
        {
            System.out.println(vector.get(i));
        }
    }
}
//n this example we are removing two String values from Collections.Vector of Strings. The steps are as follows:
//1) Create a Collections.Vector
//2) Add elements to the Collections.Vector using add(Element e) method of Collections.Vector class.
//3) SubjectHeadings.Remove elements using remove(Object o) method of Collections.Vector.
