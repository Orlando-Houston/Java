package Udemy;

public class ReturnOnMethods {


    public static int dublicate (int a) {
        return a*2;
    }

    public static int addUpWithTwo(int a) {
        return a+2;

    }

    public static int  timesWithFour(int a) {
        return a*4;

    }

    public static int sumReturn(int a,int b,int c) {
        return (a+b+c);


    }

    public static void sum(int a,int b,int c) {
      //  System.out.println (a+b+c);

    }

    public static void main(String[] args) {
      //  System.out.println ("output value="+sumReturn (1,2,3));
      //  sum (1,2,3);

        System.out.println ("Result:"+timesWithFour ( addUpWithTwo ( dublicate (8))));
    }
}
//return is last code in the method
//whatsover code dosn't work after return
