package ArraysList;
/*In this tutorial we will see how to get a sublist from an existing ArrayList. We will be doing
 it using the subList method of ArrayList class.
 */
import java.util.ArrayList;
import java.util.List;

public class GetSubListOfArrayList {
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();

        //Addition of elements in ArrayList
        al.add("Steve");
        al.add("Justin");
        al.add("Ajeet");
        al.add("John");
        al.add("Arnold");
        al.add("Chaitanya");

        System.out.println("Original ArrayList Content: "+al);

        //Sublist to ArrayList
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
        System.out.println("SubList stored in ArrayList: "+al2);

        //Sublist to List
        List<String> list = al.subList(1, 4);
        System.out.println("SubList stored in List: "+list);
    }
}

