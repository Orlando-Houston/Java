package Udemy;

public class UnaryOperators1 {
    public static void main(String[] args) {
        int x=+3;// + redundant
        System.out.println ("x="+x);

        double y=-x;
        System.out.println ("x="+x+" "+"y="+y);


        y=-y;//-1*y
        System.out.println ("x="+x+"y="+y);

        boolean a=true;
        boolean b=!a;

        System.out.println ("a="+a+" b="+b);//true  false

        b=!b;
        System.out.println ("a="+a+ " "+"b="+b);

       // int myInt=!5;//does not compile
       // boolean=-true;//does not compile
       // boolean z=!0;//does not compile

        //increment and decrement be carefull,have higher order than(+,-,*,/,...)

        int myInt=5;
        myInt=myInt+1;
        int otherInt=myInt;

        System.out.println (myInt+otherInt);
        System.out.println ("myInt="+myInt+" "+"otherInt"+otherInt);

        int newInt=5;
       // int newOtherInt=newInt;
      //  newInt=newInt+1;
        int newOtherInt=newInt++;
        System.out.println ("newInt="+newInt+""+"newOtherInt"+newOtherInt);//6/5

        int count=0;
        System.out.println (count);
        System.out.println (++count);//1
        System.out.println (count);//1
        System.out.println (count--);//1 but also set count to 0);
        System.out.println (count);//0
    }
}
