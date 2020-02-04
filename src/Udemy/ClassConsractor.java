package Udemy;

class Dog1{  //class
    //fields properties
    private String color;


      //constructor
    public  Dog1(String color){   //constructor  is a method
        this.color=color;

    }

    public  void printColor(){
        System.out.println ("color="+this.color); // or
        System.out.println (color);
    }

  //  public dog1(){}//its not compiler

  //  public void Dog1(){}//it is compiler  but its not constructor it has  RETURN TYPE VOID
}

  class Cat{    //class
    private String color;
    private int height;
    private int length;

    public Cat(int length,int theHeight){  //constructor
        //length=this.length toplanir ama sikintili
        this.length=length;
        height=theHeight;
        color="white";
    }
    public void printInfo(){
        System.out.println ("Cat Length"+this.length+"height"+this.height+"color="+color);//this optional
    }
  }
public class ClassConsractor {
    public static void main(String[] args) {
        Dog1 dog1=new Dog1 ("black");
        dog1.printColor ();

        Cat cat=new Cat (10,12);
        cat.printInfo ();

    }
}
