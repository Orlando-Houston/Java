package Udemy;

public class Static {
    private String name="Static";//non static(instance variable)variable

    public static  void one(){}  //static method
    public static void two(){}

    public  static void three(){  //static method
        one ();
        two ();
      //  three ();//recursion
      //  four();//compile fail
     //   System.out.println (name);compile error


    }
    public void four(){
        one ();
        two ();
        three ();
        System.out.println (name);


    }

    public static void main(String[] args) {
        Static.one ();
        one ();
        two ();
        three ();
       // four();// compile failer  //not static

        Static myInstance= new Static ();

        myInstance.four ();

        new Static ().four ();//other way


    }



}
