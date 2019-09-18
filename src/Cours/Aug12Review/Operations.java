package Cours.Aug12Review;

public class Operations {
    public static void main(String[] args) {
        System.out.println(doCalculation(15,6,"divide"));

    }
    public static double doCalculation(int a, int b, String operation){
        double result =0;
        if(operation.equals("add")){
            result=a+b;
        }
        else if (operation.equals("subtract")){
            result = a-b;
        }
        else if (operation.equals("multiply")){
            result = a*b;
        }
        else if (operation.equals("divide")){
            double temp = 0;
            try {
                temp = a / b;
            }
            catch (ArithmeticException e){
                System.out.println("Division by 0");
            }
            result=temp;
        }
        else {
            System.out.println("operation is incorrect");
        }

        return result;
    }

}
