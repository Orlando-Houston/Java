package Collections.ArrayList;
import java.util.ArrayList;

public class ClonArray {
    public static void main(String a[]){
        ArrayList<String> al = new ArrayList<String>();

        //Adding elements to the Collections.ArrayList
        al.add("Apple");
        al.add("Orange");
        al.add("Mango");
        al.add("Grapes");
        System.out.println("Collections.ArrayList: "+al);

        ArrayList<String> al2 = (ArrayList<String>)al.clone();
        System.out.println("Shallow copy of Collections.ArrayList: "+ al2);

        //add and remove on original Collections.ArrayList
        al.add("Fig");
        al.remove("Orange");

        //Display of both ArrayLists after add & remove
        System.out.println("Original Collections.ArrayList:"+al);
        System.out.println("Cloned Collections.ArrayList:"+al2);
    }
}
