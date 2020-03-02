package Abstract;

public abstract class Bike {
    Bike(){  //constructor
        System.out.println ("bike is created");
    }
    abstract  void run();//abstract methods   empty boddy

    void changeGear(){   //concrete method
        System.out.println ("gear changed");
    }
}
//creating child class with inherits Abstract class
class Honda extends Bike{
    void run(){
        System.out.println ("running safely..");
    }
}
class BikeMain{
    public static void main(String[] args) {
        Bike bike=new Honda ();
        bike.run ();
        bike.changeGear ();
    }
}
