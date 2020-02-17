package Oracle;

public class Car {
    int passenger;
    int fuelCap;
    int mpg;

    //return the range
    int range(){
        return mpg*fuelCap;
    }
    //compute fuel needed for a given distance
    double fuelNeeded(int miles){

       return (double)miles/mpg;
    }
}
class CompFuel{
    public static void main(String[] args) {
        Car minivan=new Car ();
        Car sportCar=new Car ();
        double gallons;
        int dist=252;

       // assign values to fields in minivan
        minivan.passenger=7;
        minivan.fuelCap=14;
        minivan.mpg=21;

        minivan.passenger=2;
        minivan.fuelCap=14;
        minivan.mpg=21;



        gallons=minivan.fuelNeeded (dist);
        System.out.println ("to go"+dist+"miles minivan needs"+gallons+"gallons of fuel");

        gallons=sportCar.fuelNeeded (dist);
        System.out.println  ("to go"+dist+"miles sport car needs"+gallons+"gallons of fuel");

        }
    }

