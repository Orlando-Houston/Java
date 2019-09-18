package Collections.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;


public class Synchronize1 {
    public static void main(String a[]){
        CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();

        //Adding elements to synchronized Collections.ArrayList
        al.add("Pen");
        al.add("NoteBook");
        al.add("Ink");

        System.out.println("Displaying synchronized Collections.ArrayList Elements:");
        //Synchronized block is not required in this method
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

}
