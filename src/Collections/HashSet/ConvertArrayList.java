package Collections.HashSet;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class ConvertArrayList {


        public static void main(String[] args) {
            // Create a Collections.HashSet
            HashSet<String> hset = new HashSet<String>();

            //add elements to Collections.HashSet
            hset.add("Steve");
            hset.add("Matt");
            hset.add("Govinda");
            hset.add("John");
            hset.add("Tommy");

            // Displaying Collections.HashSet elements
            System.out.println("Collections.HashSet contains: "+ hset);

            // Creating a List of Collections.HashSet elements
            List<String> list = new ArrayList<String>(hset);

            // Displaying Collections.ArrayList elements
            System.out.println("Collections.ArrayList contains: "+ list);
        }
}
