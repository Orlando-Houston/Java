package Oracle;

public class VehicleBook {
    int passengers;  //number of passengers
    int fuelCap;   //fuel capacity in gallons
    int mpg;  //fuel consumption in miles
}
class VehicleDemo {   //subclass  //static olmadan  variables  don't invoke
    public static void main(String[] args) {

        VehicleBook minivan = new VehicleBook ();//create a vehicle object called minivan
        int range;
        //assign values to fields in minivan
    minivan.passengers=7;
    minivan.fuelCap=16;
    minivan.mpg=21;

   // compute(hesaplamak) the range assuming a full thank of gas
        range=minivan.fuelCap*minivan.mpg;
        System.out.println ("minivan can carry:"+ minivan.passengers+ "with a range of:" + range);

}}

