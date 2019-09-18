package Cours.June27;

public class AutoTypeConversion {
    public static void main(String[]args){
        byte theSmallest=127;
        short smaller=theSmallest;
        int medium=smaller;
        long big=medium;
        float bigger=big;
        double theBiggest=bigger;


        System.out.println("This is Byte\t:"+theSmallest);
        System.out.println("This is Short\t:"+smaller);
        System.out.println("This is int\t:"+medium);
        System.out.println("This is Long\t:"+big);
        System.out.println("This is Float\t:"+bigger);
        System.out.println("This is Double\t:"+theBiggest);





    }









}
