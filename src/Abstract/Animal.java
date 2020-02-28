package Abstract;

public abstract   class Animal {
   // abstract  method doesn't have nay method
    public abstract void  animalSound();
    //Regular method
    public void sleep(){
        System.out.println ("Zzz");
    }

} //inherit from animal
class Horse extends Animal{
   // public void sleep(){}
    public void animalSound(){
        //the body of animal sound()provided here
        System.out.println ("the horse says : ihihhihi");
    }
}
class mainClass{
    public static void main(String[] args) {
        Horse myHorse=new Horse ();
        myHorse.sleep ();
        myHorse.animalSound ();
    }
}
//eger abstract olmayan metodu
