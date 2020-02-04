package Udemy;

public class MethodOverloading {


    public static void sum(String a,String b) {
        System.out.println (a+" "+b);// " "  this means space

    }

    public static void sum(int a,int b,int c) {
        System.out.println ("total="+(a+b+c));

    }

    public static void sum(int a,int b) {///  overloading    // solve the problem

    }
    public static void main(String[] args) {
        sum (3,4,5);
       // sum (3,5);//it has problem because  it has three parameters but you sent 2 parameters
        sum (2,4);
        sum ("Altun","Ozder");
    }
}
