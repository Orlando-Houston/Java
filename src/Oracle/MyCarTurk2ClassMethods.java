package Oracle;

public class MyCarTurk2ClassMethods {
    public static void main(String[] args) {
        CarTurk2 car2=new CarTurk2 ();
        car2.setCarProperties ("Dark Greey","Toyota",1.8,4);

        System.out.println (car2.getColor ());
        System.out.println (car2.getDoors ());
        System.out.println (car2.getEngine ());
        System.out.println (car2.getModel ());
        car2.start ();
        car2.stop ();
    }
}
