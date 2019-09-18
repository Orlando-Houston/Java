package Cours.Aug7;

public class RoadBike extends BicycleParent {
    public int tireSize;
    public String handleBar;

    public RoadBike (int gear, int speed, int tireSize, String handleBar){
        super(gear,speed);
        this.tireSize = tireSize;
        this.handleBar = handleBar;
    }

    public void changeTireSize(int newTire){
        this.tireSize = newTire;
    }

    public String toString(){
        return (super.toString()+
                "tire size "+ this.tireSize + " handle bar " +this.handleBar);
    }
}

