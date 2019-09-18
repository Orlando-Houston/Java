package SubjectHeadings.StringClass;
//Convert a String to int with leading zeroes

public class Z {
    public static void main(String args[]){
        String str="00000678";
        /* String to int conversion with leading zeroes
         * the %08 format specifier is used to have 8 digits in
         * the number, this ensures the leading zeroes
         */
        str = String.format("%08d", Integer.parseInt(str)+102);
        System.out.println("Output String: "+str);
    }
}
