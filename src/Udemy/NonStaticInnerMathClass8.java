package Udemy;

import java.util.Scanner;

public class NonStaticInnerMathClass8 {
    private double PI=Math.PI;

    public  class Factorial{
        public void factorial(){
            Scanner scanner=new Scanner (System.in);
            System.out.println ("Enter a number");
            int number=scanner.nextInt ();

            int fact=1;    //variable
             for (int i=2;i<=number;i++){
                 fact*=i;
             }
            System.out.println ("factoriel="+fact);
        }
    }
    public class Asal{
        public boolean asal_mi (int number){
            int i=2;
            while(i<number){
                if (number%i==0){
                    return false;
                }
                i++;
            }
            return  true;


        }
    }
    public  class Alan{
        public class DaireAlani{
            public  void daire_alan(int yaricap){
                System.out.println ("Dairenin alani:"+(yaricap*yaricap*PI));
            }
        }
    }

}
