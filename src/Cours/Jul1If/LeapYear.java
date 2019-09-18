package Cours.Jul1If;

public class LeapYear {
    public static void main(String[] args) {
        int year=2004;
        if (year%4==0&&year%400==0&&year%100!=0){
            System.out.println("Leap year");

        }
        else{
            System.out.println(" Not Leap year");

        }
    }


}

