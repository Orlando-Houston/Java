package Collections.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class SublistExample {
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();

        //Addition of elements in Collections.ArrayList
        al.add("Steve");
        al.add("Justin");
        al.add("Ajeet");
        al.add("John");
        al.add("Arnold");
        al.add("Chaitanya");

        System.out.println("Original Collections.ArrayList Content: "+al);

        //Sublist to Collections.ArrayList
        ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
        System.out.println("SubList stored in Collections.ArrayList: "+al2);

        //Sublist to List
        List<String> list = al.subList(1, 4);
        System.out.println("SubList stored in List: "+list);
    }
}



