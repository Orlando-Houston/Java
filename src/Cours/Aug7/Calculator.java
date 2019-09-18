package Cours.Aug7;

public class Calculator {   //parent
    int displayValue;

    public Calculator(){
        this.displayValue=0;
    }
    public int add(int number1, int number2){
        return number1+number2;

    }
    public int add(double number1,double number2){
        return(int)(number1+number2);
    }

    public double divide (int number1,int number2) {
        double result = 0;
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
        }

        return result;
    }

    public int substract(int number1,int number2){
        return number1-number2;
    }
    public int multiply(int number1,int number2){
        return number1*number2;
    }
}
