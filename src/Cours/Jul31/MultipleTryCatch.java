package Cours.Jul31;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            arr[10]=10/5;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index issue");
        }
        catch (Exception e){
            System.out.println("parent exception");
        }
        System.out.println("Show must go on");

    }
}

