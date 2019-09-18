package Collections.Vector;
import java.util.Vector;

public class SetSize {
    public static void main(String[] args) {
        // Create a Collections.Vector
        Vector<String> vector = new Vector<String>();

        //Add elements to Collections.Vector
        vector.add("Walter");
        vector.add("Anna");
        vector.add("Hank");
        vector.add("Flynn");
        vector.add("Tom");

        //Setting up the size greater than current size
        vector.setSize(10);
        System.out.println("Collections.Vector size: "+vector.size());
        System.out.println("Collections.Vector elements: ");
        for(int i=0; i < vector.size(); i++){
            //get(i) method fetches the element from index i
            System.out.println(vector.get(i));
        }

        //Setting up the size less than current size
        vector.setSize(4);
        System.out.println("\nCollections.Vector size: "+vector.size());
        System.out.println("Collections.Vector elements: ");
        for(int i=0; i < vector.size(); i++){
            System.out.println(vector.get(i));
        }
    }

}
