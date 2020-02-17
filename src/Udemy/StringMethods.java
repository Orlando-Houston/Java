package Udemy;

public class StringMethods {
    public static void main(String[] args) {

        //0 1 2 3 4 5 6 7 8 9 10
        //j a v a   i s   f u n
        String str="java is fun";
        //length
        System.out.println ("length="+str.length ());
        //charAt  ///numbers index
        System.out.println (str.charAt (0));
        System.out.println (str.charAt (2));
        System.out.println (str.charAt (6));
        System.out.println (str.charAt (10));//11
        System.out.println ();


        //index of
        System.out.println (str.indexOf ('a'));//eleman hangi indexte
        System.out.println (str.indexOf ('a',2));//index 2 den baslayarak bul
        System.out.println (str.indexOf ("fun"));//whole string fun
        System.out.println (str.indexOf ("fun",10));// -  match not found

        // substring
                          //   index
       // str.substring (8); degistirilemez..degistirmek icin alttakini  yazmaliyiz
    //  str=  str.substring (8);
        System.out.println (str.substring (8));
        System.out.println (str.substring (0, 5));
     //   System.out.println (str.substring (4, 4));//empty string  tricky//nothing printed
     //   System.out.println (str.substring (4,2));//out of range
     //  System.out.println (str.substring (8,14));//out of range


       System.out.println ("AbCd".toLowerCase ());
        System.out.println (str.toUpperCase ());
      //  System.out.println (str);


       String dog="Lucky";
       dog.toUpperCase ();
       System.out.println (dog);

        dog=dog.toUpperCase ();
        System.out.println (dog);
    }

}
