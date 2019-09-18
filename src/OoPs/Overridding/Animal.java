package OoPs.Overridding;

public class Animal {
    public void sound(){
        System.out.println("Animal is making a sound");
    }
}
 class Horse extends Animal{
   // @Override
    public void sound(){
        System.out.println("Neigh");
    }
}
class Cat extends Animal{

   // @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
        Animal obj = new Horse();
        Animal obj1=new Cat();
        obj.sound();
        obj1.sound();
}}
/*As you can see that although we had the common action for all subclasses sound()
 but there were different ways to do the same action. This is a perfect example of polymorphism
 (feature that allows us to perform a single action in different ways). It would not make any sense to just
  call the generic sound() method as each Animal has a different sound.
 Thus we can say that the action this method performs is based on the type of object.
 */

