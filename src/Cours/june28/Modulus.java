package Cours.june28;

public class Modulus {
    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 2;
        int remainder = number1 % number2;
        System.out.println(remainder);


        int number3 = 9;
        int number4 = 5;
        int remainder1 = number2 % number4;
        System.out.println("Remainder:"+remainder);


        int number5=11;
        int number6=7;
        int remainder2=number5&number6;
        System.out.println("Remainder for:"+number5+"/"+number6+" is:"+remainder2);

        int start=99;
        start++;
        start++;
        start++;
        System.out.println("New value of start:"+start);
        start--;
        System.out.println("Newer value of start:"+start);


        int start1=98;
        start1=start1+10;
        System.out.println("New value of start:"+start1);
    }
}
