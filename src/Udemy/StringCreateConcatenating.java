package Udemy;

public class StringCreateConcatenating {
    public static void main(String[] args) {
        //same content   different refferance
        String text="hello";
        String anotherText=new String ("hello");

        System.out.println (2+3);//=5  + operators
        System.out.println ("a"+"b");//expected ab    + concatenating
        System.out.println (1+2+"d");//3d
          //  variable name
        int three=3;  //int value
        String four="4";//String value
        System.out.println (1+2+three+four);//64


        int number=10;
        int anotherNumber=20;
        System.out.println ("result="+number+anotherNumber);//1020
        System.out.println (""+10+20);
        //result string oldugu icin yanindaki pluse conc olarak goruyor
        System.out.println (("result="+(number+anotherNumber)));//plus operation


        String str="";//empty string

        for (int i=0;i<10;i++){
            str+= i+" ";

        }
        System.out.println (str);


        String hello="hello";
        String world="world";
        String helloWorld=hello+world;
        System.out.println (helloWorld);
        System.out.println (hello);
       // String greating=hello+world;
      //  System.out.println (greating);



    }

}
