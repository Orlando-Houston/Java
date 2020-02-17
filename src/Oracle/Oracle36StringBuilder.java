package Oracle;

import Collections.HashMap.Sort;

public class Oracle36StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder ("Duke");
        String str1=sb1.toString ();
        //insert code here
        String str2=str1;
        System.out.println (str1==str2);



        String palindrome="rats live on no evil star";
        StringBuilder sb=new StringBuilder (palindrome);
        sb.reverse ();//reverse it
        System.out.println (sb);

        StringBuilder sb2=new StringBuilder ("Hello");
        sb2.append ("foreign");
        System.out.println (sb2);


    }


}
