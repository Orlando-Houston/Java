package ExceptionHandling;

public class Exception4 {
    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied-You must be at least 18 years old");
        }
        else{
            System.out.println("Acces granted-You are old enough!");
        }
    }
    public static void main(String args[]){
        checkAge(15);
}
}
