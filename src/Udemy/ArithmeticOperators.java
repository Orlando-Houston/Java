package Udemy;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int result=3-2+2*2+3;
        System.out.println ("result="+result);
        //first * then left to right process

        result=4/2+1-4*2+10;
        System.out.println (result);
        //first division or multiplication and then left to right operations



        int a=4;
        int b=3-2*--a;//decrement then use
        System.out.println (a);
       System.out.println (b);



        a=4;
        b=3-2*a--;
        System.out.println (a);
        System.out.println (b);



        long c=2;
        long d= 4+3*c++;
        System.out.println ("c="+c);
        System.out.println ("d="+d);


        result=10-3*(2+1)-4/(1+3);
        System.out.println ("result="+result);




        int i=10;
        int j=3;

        int k=i%j;
        System.out.println ("k="+k);





        int e=10%2;
        System.out.println ("e="+e);

        int f=12;
        int g=5;
        int h=2;

        int m=f/2-10%(4+3)-2*f%g-h*3;

        System.out.println ("m="+m);


    }

}

