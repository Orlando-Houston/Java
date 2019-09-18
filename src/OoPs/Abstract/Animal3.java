package OoPs.Abstract;       /*single/multilevel/hierarchical/hybrid inheritance
*/

abstract class Animal3 {             //hierarchical inheritance   // abstract class
    public abstract void sound();     //abstract method
}
//Dog class extends Animal class
 class Dog extends Animal3{     //regular class concrete class
    public  void sound(){
        System.out.println("Woof") ;  //method
    }
}
     class Lions extends Animal3{
        public void sound(){
            System.out.println("raaaaar");
        }
}
        class Horse extends Animal3{
            public void sound (){
                System.out.println("...");
            }
        }
         class Cat extends Animal3{
            @Override
            public void sound() {
                System.out.println("miyavv");
            }



    public static void main(String[] args) {
        Animal3 obj=new Dog();
        obj.sound();
        Animal3 obj1=new Lions();
        obj1.sound();
        Animal3 obj2=new Horse();
        obj2.sound();
        Animal3 obj3=new Cat();
        obj3.sound();

    }
}

