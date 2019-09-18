package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Synchronize {
    public static void main(String a[]){
        List<String> syncal =
                Collections.synchronizedList(new ArrayList<String>());

        //Adding elements to synchronized Collections.ArrayList
        syncal.add("Pen");
        syncal.add("NoteBook");
        syncal.add("Ink");

        System.out.println("Iterating synchronized Collections.ArrayList:");
        synchronized(syncal) {
            Iterator<String> iterator = syncal.iterator();
            while (iterator.hasNext())
                System.out.println(iterator.next());
        }
    }
    //As we are aware that Collections.ArrayList is non-synchronized and should not be used in multi-thread environment
    // without explicit synchronization. This post is to discuss how to synchronize Collections.ArrayList in Java.
    //
    //There are two ways to synchronize explicitly:
    //
    //Using Collections.synchronizedList() method
    //Using thread-safe variant of Collections.ArrayList: CopyOnWriteArrayList


}
