package Collections.ArrayList;
import java.util.ArrayList;

public class CheckEmpty {
    public static void main(String args[]) {
        //Collections.ArrayList of Integer Type
        ArrayList<Integer> al = new ArrayList<Integer>();
        //Checking whether the list is empty
        System.out.println("Is Collections.ArrayList Empty: "+al.isEmpty());

        //Adding Integer elements
        al.add(1);
        al.add(88);
        al.add(9);
        al.add(17);

        //Again checking for isEmpty
        System.out.println("Is Collections.ArrayList Empty: "+al.isEmpty());

        //Displaying elements of the list
        for (Integer num: al) {
            System.out.println(num);
        }
    }
}
/*isEmpty() method of java.util.Collections.ArrayList class is used for checking whether the list is empty or not.
 This method returns a boolean value.
 */




