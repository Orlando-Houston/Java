package Udemy;

public class UnderstandingNull {
    //fields   global variable

    static  Object myObject=new Object ();
    static  Object myOtherObject;

    static  int myInt;

    static  String myString;

    public static void main(String[] args) {
     //   System.out.println (myInt);//0
     //   System.out.println (myObject);
     //   System.out.println (myOtherObject);//null
      //  System.out.println (myString);  //null


        //Local variable
        Object myLocalObject=new Object ();
        Object anotherLocalObject;

        int myInt;
        String name="Java";
        String anotherName;
        String nullName=null;

        System.out.println (myLocalObject);
      //  System.out.println (anotherLocalObject);//compiler error
        System.out.println (name);
       // System.out.println (anotherName);//compiler error
        System.out.println (nullName);
       //   System.out.println (myInt);  compile error



        myString="Java";//gloable   variable

        System.out.println (myString);

        myString.toLowerCase ();
        System.out.println (myString);

        myString.toUpperCase ();
        System.out.println (myString);


    }
}
