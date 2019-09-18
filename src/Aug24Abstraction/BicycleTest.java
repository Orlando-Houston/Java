package Aug24Abstraction;

public class BicycleTest {
    public static void main(String[] args) {
MountainBike myBike=new MountainBike("knobby",40,0);
myBike.start();
myBike.slowDown(30);

        System.out.println(myBike.speed);
    }
}
