package Cours.Aug12Review;

public class ParkingFee {
    public static void main(String[] args) {
        calculateParkingFee(-1,false);
    }
    public static void calculateParkingFee(int hours,boolean member){
        if(member){
            System.out.println("No charge");
        }
        else {
            if(hours>12){
                System.out.println("$15");
            }
            else if(hours>6){
                System.out.println("$10");
            }
            else if(hours>2){
                System.out.println("$5");
            }

            else {
                System.out.println("$3");
            }
        }
    }
}

