package Collections.HashMap;
import java.util.HashMap;

public class RemoveAll {
    public static void main(String[] args) {

            // Creating a Collections.HashMap of int keys and String values
            HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

            // Adding Key and Value pairs to Collections.HashMap
            hashmap.put(11,"Value1");
            hashmap.put(22,"Value2");
            hashmap.put(33,"Value3");
            hashmap.put(44,"Value4");
            hashmap.put(55,"Value5");

            // Displaying Collections.HashMap Elements
            System.out.println("Collections.HashMap Elements: " + hashmap);

            // Removing all Mapping
            hashmap.clear();

            // Displaying Collections.HashMap Elements after remove
            System.out.println("After calling clear():");
            System.out.println("---------------------");
            System.out.println("Collections.HashMap Elements: " + hashmap);
        }
}
