package Udemy;

public class Counter {
    public static int count;  //static variable
    public int anotherCount;//non static variable(instance  variable)

    public Counter(){ //constructor
        count++;
        anotherCount++;


    }

    public static void main(String[] args) {
      //  System.out.println (Counter.count); it is work
      //  System.out.println (Counter.anotherCount);//compile failure//instance variable

        Counter one=new Counter ();  //instance  of class
        Counter two=new Counter ();
        Counter three=new Counter ();
        Counter four=new Counter ();


        System.out.println (count); //4
        System.out.println (one.count);//4
        System.out.println (two.count);//4
        System.out.println (three.count);//4
        System.out.println (four.count);//4


        count++;

        System.out.println (count);
        System.out.println (one.count);
        System.out.println (two.count);
        System.out.println (three.count);
        System.out.println (four.count);


        //instance variable
        System.out.println (one.anotherCount);//1
        System.out.println (two.anotherCount);//1
        System.out.println (three.anotherCount);//1
        System.out.println (four.anotherCount);//1

        one.anotherCount=2;
        two.anotherCount=3;
        three.anotherCount=4;
        four.anotherCount=5;

        System.out.println (one.anotherCount);//2
        System.out.println (two.anotherCount);//3
        System.out.println (three.anotherCount);//4
        System.out.println (four.anotherCount);//5









    }
}
