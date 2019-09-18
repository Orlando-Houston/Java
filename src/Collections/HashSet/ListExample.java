package Collections.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListExample {




        public static void main(String[] args) {
            List<String> al = new ArrayList<String>();
            al.add("Chaitanya");
            al.add("Rahul");
            al.add("Ajeet");
            System.out.println("Collections.ArrayList Elements: ");
            System.out.print(al);

            List<String> ll = new LinkedList<String>();
            ll.add("Kevin");
            ll.add("Peter");
            ll.add("Kate");
            System.out.println("\nCollections.LinkedList Elements: ");
            System.out.print(ll);
        }
}
