package Udemy;

class Example{
    private String name="Dog";
    {
        System.out.println (name);//instance initialize
    }



    private  static int count=0; //this is static variable
   static  {    //static initializer
        System.out.println (count);
    }

    {
        count+=10;
        System.out.println (count);
    }

    public Example(){
        System.out.println ("constructor");
    }
}

public class OrderOfInitialization {


    public static void main(String[] args) {
        Example exmp=new Example ();

    }

}
//first superclass ,second Static variable and static initiliazer,thirdy instance variable,4.constructor


