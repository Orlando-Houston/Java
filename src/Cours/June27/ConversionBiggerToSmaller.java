package Cours.June27;

public class ConversionBiggerToSmaller {
    public static void main(String[]args){
        double theBiggest=127.9876;
        float theBigger=(float)theBiggest;
        long big=(long) theBigger;
        int medium=(int) big;
        short smaller=(short) medium;
        byte theSmallest=(byte)smaller;


        System.out.println("This is double\t:"+ theBiggest);
        System.out.println("This is float\t:"+ theBigger);
        System.out.println("This is long\t:"+ big);
        System.out.println("This is int\t:"+ medium);
        System.out.println("This is short\t:"+ smaller);
        System.out.println("This is byte\t:"+ theSmallest);













    }
}
