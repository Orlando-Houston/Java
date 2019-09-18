package Cours.Jul31;

public class MultipleTryCatch2 {
    public static void main(String[] args) {
        try{

        }

        catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index issue");
        }
        catch (Exception e){
            System.out.println("Parent");
        }
        System.out.println("Show must go on");
    }
}

