package Collections.LinkedList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertExample {



        public static void main(String[] args) {
            LinkedList<String> linkedlist = new LinkedList<String>();
            linkedlist.add("Harry");
            linkedlist.add("Jack");
            linkedlist.add("Tim");
            linkedlist.add("Rick");
            linkedlist.add("Rock");

            List<String> list = new ArrayList<String>(linkedlist);

            for (String str : list){
                System.out.println(str);
            }
        }
}
//n this example we are converting a Collections.LinkedList to Collections.ArrayList. We have a Collections.LinkedList of Strings in which
// we are storing names of 5 peoples. Later after conversion we are displaying the elements of Collections.ArrayList
// to ensure that Collections.ArrayList is having same elements that we have in Collections.LinkedList.
// The complete program is as follows:
