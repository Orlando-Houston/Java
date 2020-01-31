package Udemy;

public class StringQuest2 {
    public static void main(String[] args) {
        String s="Hello";//is literal
        String t=new String (s); //difference referance t is not string pool
        if ("Hello".equals (s)) System.out.println ("one");
        if (t==s) System.out.println ("two");
        if (t.equals (s)) System.out.println ("three");
        if ("Hello"==s) System.out.println ("four");
        if ("Hello"==t) System.out.println ("five");
        //one,three four
    }
}
