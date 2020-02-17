package Udemy;

public class StringUnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one=new StringBuilder ();
        StringBuilder two=new StringBuilder ();
        StringBuilder three=one.append ("Java");

        System.out.println (one==two);//false
        System.out.println (one==three);//true  why

        String x="Java";
        String y="Java";

        System.out.println (x==y);//true


        String a="Java";
        String b=" Java".trim ();
      //  b=b.trim ();boyle yazarsam  esit olur
        System.out.println (a==b);//false why? because trim method return new string
        //for same be StringBuilder

        String c="Java";
        String d=" Ja".trim ()+"va";
        System.out.println (c==d);//false
    }
}
