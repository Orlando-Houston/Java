package Oracle;

public class OracleString49 {
    public static void main(String[] args) {
       // System.out.println (" ".trim ());
          String str=" ";
        str.trim ();//it doesnt change // question is this
       // str=str.trim ();//it new string object

        System.out.println (str.equals ("")+"_"+str.isEmpty ());
    }
}
