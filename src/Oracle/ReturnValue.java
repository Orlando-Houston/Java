package Oracle;

public class ReturnValue {
    int passengers;
    int fuelcap;
    int mpg;

    //Return the range.
    int range(){
        return mpg*fuelcap;
    }
}
class RetMath{
    public static void main(String[] args) {

        ReturnValue minivan=new ReturnValue ();
        ReturnValue sportCar=new ReturnValue ();

        int range1,range2;

        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;

        sportCar.passengers=2;
        sportCar.fuelcap=14;
        sportCar.mpg=12;


        range1=minivan.range ();
        range2=sportCar.range ();

        System.out.println ("minivan can cary "+minivan.passengers+
                "with range of" + range1+ "miles");
        System.out.println ("sport car can cary : " +sportCar.passengers+ "with range of " +range2+ "miles");


    }



    }

