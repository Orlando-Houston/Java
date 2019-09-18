package Collections.HashSet;
import java.util.HashSet;
import java.util.Set;

public class WithoutIterate {
    public static void main(String[] args) {
        // Create a Collections.HashSet
        Set<String> hset = new HashSet<String>();

        //add elements to Collections.HashSet
        hset.add("Chaitanya");
        hset.add("Rahul");
        hset.add("Tim");
        hset.add("Rick");
        hset.add("Harry");

        for (String temp : hset) {
            System.out.println(temp);
        }
    }
}
