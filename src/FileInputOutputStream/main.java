package FileInputOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args)  {
        FileOutputStream fos=null;
        //File file=new File("file.txt") bu sekilde de olabilir..asagidaki gibi de

        try {
            fos =new FileOutputStream ("file.txt",true);
           // fos.write (65);   ascii karakter olarak yazilyor
           // byte[]array={66,67,68,69};
         //   fos.write (array);
            /*
            String s="Altun Keskin";
            byte[] s_array=s.getBytes ();
           fos.write (s_array);

             */
            String s="Java programlama dili";
            byte[] s_array=s.getBytes ();
            byte[]s_arrays1=s.getBytes ();
            fos.write (s_array);
            fos.write (s_arrays1);




        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fos.close ();
            } catch (IOException e) {
                e.printStackTrace ();
                System.out.println ("Dosya kapatilirken bir hata olustu");
            }
        }
    }

}
