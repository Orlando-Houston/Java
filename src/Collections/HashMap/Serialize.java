package Collections.HashMap;
import java.io.*;
import java.util.HashMap;

public class Serialize { public static void main(String [] args) {
            HashMap<Integer, String> hmap = new HashMap<Integer, String>();
            //Adding elements to Collections.HashMap
            hmap.put(11, "AB");
            hmap.put(2, "CD");
            hmap.put(33, "EF");
            hmap.put(9, "GH");
            hmap.put(3, "IJ");
            try
            {
                FileOutputStream fos =
                        new FileOutputStream("hashmap.ser");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(hmap);
                oos.close();
                fos.close();
                System.out.printf("Serialized Collections.HashMap data is saved in hashmap.ser");
            }catch(IOException ioe)
            {
                ioe.printStackTrace();
            }
        }
}
