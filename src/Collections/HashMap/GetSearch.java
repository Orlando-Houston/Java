package Collections.HashMap;
import java.util.HashMap;

public class GetSearch {
    public static void main(String[] args) {

        // Creating a Collections.HashMap of int keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to Collections.HashMap
        hashmap.put(11,"Chaitanya");
        hashmap.put(22,"Pratap");
        hashmap.put(33,"Singh");
        hashmap.put(44,"Rajesh");
        hashmap.put(55,"Kate");

        // Checking Key Existence
        boolean flag = hashmap.containsKey(22);
        System.out.println("Key 22 exists in Collections.HashMap? : " + flag);

        boolean flag2 = hashmap.containsKey(55);
        System.out.println("Key 55 exists in Collections.HashMap? : " + flag2);

        boolean flag3 = hashmap.containsKey(99);
        System.out.println("Key 99 exists in Collections.HashMap? : " + flag3);
    }
}
