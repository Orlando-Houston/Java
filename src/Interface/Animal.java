package Interface;

public interface Animal {
    public void animalSound();//interface methods(does not have a body)
    public void sleep();
  // public void run();//interface method
}
class Dog implements Animal{

    public void animalSound(){
        //the body of animalsound()is provided here
        System.out.println ("The Dog says:woow woow");
    }
    public void sleep(){
        System.out.println ("Zzzz");
    }

}
class AnimalMain{
    public static void main(String[] args) {
        Dog husky=new Dog ();
        husky.animalSound ();
        husky.sleep ();
    }
}
