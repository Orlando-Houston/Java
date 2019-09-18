package SubjectHeadings.StringClass;
// Converting int to String

public class C {
    public static void main(String[] args) {

        /* Method 1: using valueOf() method
         * of String class.
         */
        int ivar = 111;
        String str = String.valueOf(ivar);
        System.out.println("String is: "+str);

        /* Method 2: using toString() method
         * of Integer class
         */
        int ivar2 = 200;
        String str2 = Integer.toString(ivar2);
        System.out.println("String2 is: "+str2);
    }
}
