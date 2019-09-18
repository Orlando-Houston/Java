package SubjectHeadings.MethodFerhat.MethodFunction;

public class MobilH {
    public static void main(String[] args) {
        System.out.println("Total");
        total(5, 6);
        System.out.println("subtraction");
        substraction1(10, 2);
        subtraction2(8, 12);
        System.out.println("multiplication");
        multiplication(5, 6);
        System.out.println("divide");
        divide(10, 2);
    }


    public static void total(int number1, int number2) {
        int total = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + total);
    }

    public static void substraction1(int number1, int number2) {
        int subtraction1 = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + subtraction1);
    }

    //eger cikarma isleminde negatif deger cikmasini istemiyorsak
    public static void subtraction2(int number1, int number2) {
        if(number1 > number2) {
            int subtraction2 = number1 - number2;
            System.out.println(number1 + " - " + number2 + " = " + subtraction2);
        } else {
            System.out.println(number1+ " less than " + number2);
            int subtraction2 = number2 - number1;
            System.out.println(number2 + " - " + number1 + " = " + subtraction2);
        }
    }

    public static void multiplication(int number1, int number2) {
        int multiplication = number1 * number2;
        System.out.println(number1 + " x " + number2+ " = " + multiplication);
    }

    public static void divide(int number1, int number2) {
        int divide = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + divide);
    }


}

