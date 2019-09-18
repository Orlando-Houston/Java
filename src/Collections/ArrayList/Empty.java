package Collections.ArrayList;
import java.util.ArrayList;

public class Empty {
    public static void main(String [] args)
    {
        ArrayList<String> al1=new ArrayList<String>();
        al1.add("abc");
        al1.add("xyz");

        System.out.println("Collections.ArrayList before clear: "+al1);
        al1.clear();
        System.out.println("Collections.ArrayList after clear: "+al1);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("text 1");
        al2.add("text 2");

        System.out.println("Collections.ArrayList before removeAll: "+al2);
        al2.removeAll(al2);
        System.out.println("Collections.ArrayList before removeAll: "+al2);
    }
}
