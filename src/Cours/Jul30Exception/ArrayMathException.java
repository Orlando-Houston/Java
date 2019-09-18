package Cours.Jul30Exception;

public class ArrayMathException {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5,6};
        try{
            myArr[9]= 5/0;
        }
        catch (Exception e){
            System.out.println("Exception occurred");
        }
        /*
        catch (ArithmeticException e){
            System.out.println("division by zero");
        }

         */

        System.out.println("SHOW MUST GO ON");

    }
}

