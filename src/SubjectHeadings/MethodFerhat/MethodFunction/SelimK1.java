package SubjectHeadings.MethodFerhat.MethodFunction;

public class SelimK1 {
    public static void main(String[] args) {
        System.out.println(substraction(7,23));
        //method call
    }
    //parametreli metod olusturma
    public static  int substraction(int number1,int number2){
        int substraction;
        if (number1>number2){
            substraction=number1-number2;
        }
        else{
            substraction=number2-number1;
        }
        return substraction;

    }
}
