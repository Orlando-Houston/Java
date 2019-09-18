package Collections.HashSet;
import java.util.HashSet;

public class X {
    public static void main(String[] args) {
        // Create a Collections.HashSet
        HashSet<String> hset = new HashSet<String>();

        //add elements to Collections.HashSet
        hset.add("Abhijeet");
        hset.add("Ram");
        hset.add("Kevin");
        hset.add("Singh");
        hset.add("Rick");
        // SubjectHeadings.Duplicate removed
        hset.add("Ram");

        // Displaying Collections.HashSet elements
        System.out.println("Collections.HashSet contains: ");
        for(String temp : hset){
            System.out.println(temp);
        }
    }
}
