package SubjectHeadings.StringClass;
//Convert String to int using Integer.valueOf(String)

public class X {
    public static void main(String args[]){
        //String with negative sign
        String str="-234";

        //An int variable
        int inum = 110;

        /* Convert String to int in Java using valueOf() method
         * the value of variable inum2 would be negative after
         * conversion
         */
        int inum2 = Integer.valueOf(str);

        //Adding up inum and inum2
        int sum = inum+inum2;

        //displaying sum
        System.out.println("Result is: "+sum);
    }
}
