package Oracle;

public class O50StrEqls {
    public static void main(String[] args) {
        String str1="Java";
        String str2=new String ("java");

        String str3=str2;
        if (str1.toLowerCase ()==str2.toLowerCase ()){
            System.out.println ("equal");
        }

        /*
        if (str1.equalsIgnoreCase (str2)){
            System.out.println ("equal");
        }
        else{
            System.out.println ("not equal");
        }

         */
    }
}
