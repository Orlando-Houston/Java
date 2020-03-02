package Interface;

public interface Vehicle {
    //all the abstract methods
    void changeGear(int a);
    void speedUp( int a);
    void applyBrakes(int a);
}
class Bicycle implements Vehicle{
    int speed;
    int gear;
    //to change gear
    public void changeGear( int newGear){
        gear=newGear;
    }
    //to increase speed
    public void speedUp(int increment){
        speed=speed+increment;

      //to decrease speed
    }
    public void applyBrakes(int decrease){
        speed=speed-decrease;
    }
    public void printStates(){
        System.out.println ("speed:"+speed+"gear:"+gear);
    }

}
class Bike implements Vehicle{
    int speed;
    int gear;

    public void changeGear( int newGear){
        gear=newGear;
    }
    //to increase speed
    public void speedUp(int increment){
        speed=speed+increment;

        //to decrease speed
    }
    public void applyBrakes(int decrease){
        speed=speed-decrease;
    }
    public void printStates(){
        System.out.println ("speed:"+speed+"gear:"+gear);
    }
}
class MainVehBike{
    public static void main(String[] args) {
        //creating an instance of bicyle
        Bicycle bicycle=new Bicycle ();
        bicycle.changeGear (2);
        bicycle.speedUp (3);
        bicycle.applyBrakes (1);
        bicycle.printStates ();

        //creating an instance of bike
        Bike bike=new Bike ();
        bike.changeGear (1);
        bike.speedUp (4);
        bike.applyBrakes (3);

    }
}
