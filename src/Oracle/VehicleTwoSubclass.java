package Oracle;

public class VehicleTwoSubclass {
    int passengers;  //number of passengers
    int fuelCap;   //fuel capacity in gallons  //instance variables
    int mpg;
}
class TwoVehicles{
    public static void main(String[] args) {
        VehicleTwoSubclass minivan=new VehicleTwoSubclass ();
        VehicleTwoSubclass sportCar=new VehicleTwoSubclass ();
        int range1,range2;

        //assign values to fields in minivan
        minivan.passengers=7;
        minivan.fuelCap=16;
        minivan.mpg=21;

        //assign values to fields in sport car
        sportCar.passengers=2;
        sportCar.fuelCap=14;
        sportCar.mpg=12;

        // compute() the range assuming a full thank of gas
        range1=minivan.fuelCap*minivan.mpg;
        range2=sportCar.fuelCap*sportCar.mpg;

        System.out.println ("minivan can carry " +minivan.passengers+"with a range of"+range1);

        System.out.println ("Sport car can cary"+sportCar.passengers+"with a renge of"+range2);

    }
}
