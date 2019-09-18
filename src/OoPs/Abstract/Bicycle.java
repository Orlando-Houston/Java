package OoPs.Abstract;

abstract class Bicycle {
    abstract void speedUp();
    abstract void slowDown();
    void start(){
        System.out.println("Started to pedal");
    }
    void stop(){
        System.out.println("Bike stopped");
    }
}
