package OoPs.Aug3Day33OverLoading;

public class Execution {
    public static void main(String[] args) {
        System.out.println(add(3,4));
        System.out.println(calculate(3,4));
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static double calculate(int num1, int num2){
        double result= add(num1, num2)/5;
        return result;
    }
}
