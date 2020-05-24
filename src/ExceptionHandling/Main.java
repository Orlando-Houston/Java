package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
     //   int a=30/0;//unchecked exception //AritmExcept /by 0 ...  1
     //   System.out.println ("It is working");//              ...2

      //  int []b={1,2,3,4,5};    //....3
       // System.out.println (b[6]); //...4
    try{
        int[]a={1,2,3,4,5};
       System.out.println (a[6]);
        int b=30/0;

    }
    catch (ArithmeticException e){
        System.out.println ("Any number does not divide by 0");

    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println ("Arrayin boyunu astiniz");
    }
    catch (Exception e){
        System.out.println ("Bir hata olustu");
        e.printStackTrace ();
    }
    }


    }

