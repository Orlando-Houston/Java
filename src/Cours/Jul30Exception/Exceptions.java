package Cours.Jul30Exception;

public class Exceptions {
    public static void main(String[] args) {
        try{
            int result=4/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Next line");
    }
}
