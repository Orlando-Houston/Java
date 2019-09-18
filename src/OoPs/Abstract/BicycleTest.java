package OoPs.Abstract;

public class BicycleTest {
    public static void main(String[] args) {
        MountainBike myMTB = new MountainBike("knobby",40,0);
        myMTB.start();
        myMTB.slowDown(30);
        System.out.println(myMTB.speed);
    }
}
