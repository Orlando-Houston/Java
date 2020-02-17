package Udemy;

public class StringMethods1 {
    public static void main(String[] args) {
        String str="java";
        String str2="Java";
        String str3="ja";
        System.out.println (str.equals (str2));
        System.out.println (str.equalsIgnoreCase (str2));
        System.out.println ("abc".equalsIgnoreCase ("ABC"));//true


        //startswith/endWith
        System.out.println (str.startsWith ("j"));
        System.out.println (str.startsWith (str3));
        System.out.println (str.startsWith ("J"));
        System.out.println (str.startsWith ("J".toLowerCase ()));
        System.out.println (str.endsWith ("va"));

        //contains
        System.out.println (str.contains (str3));
        System.out.println (str.contains ("av"));
        System.out.println ("Java".contains ("j"));
        System.out.println ("Java".contains ("j".toUpperCase ()));


        //replace
        String myString="Java"+ " "+"is"+" "+"cool";
        System.out.println (myString.replace ('a','A')); //new
        System.out.println (myString.replace (" ","_"));//new
        System.out.println (myString.replace ("is","_"));//new
        System.out.println (myString);//same


        //trim    remove the space
        System.out.println ("java".trim ());
        System.out.println (" java is cool  ");
        System.out.println (" java is cool  ".trim ());
    }
}
