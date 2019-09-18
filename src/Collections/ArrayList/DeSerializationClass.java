package Collections.ArrayList;
import java.io.*;
import java.util.ArrayList;

public class DeSerializationClass {
    public static void main(String [] args)
    {
        ArrayList<String> arraylist= new ArrayList<String>();
        try
        {
            FileInputStream fis = new FileInputStream("myfile");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
            return;
        }catch(ClassNotFoundException c){
            System.out.println("SubjectHeadings.Class not found");
            c.printStackTrace();
            return;
        }
        for(String tmp: arraylist){
            System.out.println(tmp);
        }
    }
}
/*De-Serialization:

In this class we are retrieving the stream of bytes from myfile which we have stored using the above class.
 We are type casting the returned object to Collections.ArrayList and displaying the elements of Collections.ArrayList. Observe the output: We are getting the same elements which we have added
 to the Collections.ArrayList before the serialization.

 */
