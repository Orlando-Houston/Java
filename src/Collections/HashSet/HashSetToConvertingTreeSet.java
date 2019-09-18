package Collections.HashSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class HashSetToConvertingTreeSet {
    public static void main(String[] args) {
        // Create a Collections.HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to Collections.HashSet
        hset.add("Element1");
        hset.add("Element2");
        hset.add("Element3");
        hset.add("Element4");

        // Displaying Collections.HashSet elements
        System.out.println("Collections.HashSet contains: "+ hset);

        // Creating a TreeSet of Collections.HashSet elements
        Set<String> tset = new TreeSet<String>(hset);

        // Displaying TreeSet elements
        System.out.println("TreeSet contains: ");
        for(String temp : tset){
            System.out.println(temp);
        }
    }
}
