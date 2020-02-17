package Oracle;


import java.io.IOException;

class X{
    public  void printFileContent()throws IOException{
        /*code goes here */
        throw new IOException ();

    }


}
public class OrcTest {
    public static void main(String[] args)throws  IOException {
        X xobj=new X ();
        xobj.printFileContent ();


    }

}
