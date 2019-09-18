package Cours.Jul14;

public class LeapYear {
    public static void main(String[] args) {
        int year=2400;
        if (year%4==0||(year%400==0&&year%100==0)){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not leap Year");
        }
        MethodsTogether.printNumbers();
    }
}
