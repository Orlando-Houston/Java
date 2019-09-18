package Collections.ArrayList;
import java.util.ArrayList;
import java.io.*;

public class Serialization {
    public static void main(String [] args)
    {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Hello");
        al.add("Hi");
        al.add("Howdy");

        try{
            FileOutputStream fos= new FileOutputStream("myfile");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(al);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
/*Serialization: Run the below class and it will create a file myfile which will be having Collections.ArrayList object in form of
 Stream of bytes. We would be using “myfile” at the receivers end to recreate the Object from stream of bytes. Note:
  We did not implemented the Serializable interface
 in the below class because Collections.ArrayList is already been serialized by default.
 */
