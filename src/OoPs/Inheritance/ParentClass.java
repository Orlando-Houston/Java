package OoPs.Inheritance;

public class ParentClass {
    //Parent class constructor
    ParentClass(){
        System.out.println("Constructor of Parent");
    }
    void disp(){
        System.out.println("Parent Method");
    }
}
class ChildClass1 extends ParentClass{
    ChildClass1(){
        System.out.println("Constructor of Child");
    }
    void disp(){
        System.out.println("Child Method");
        //Calling the disp() method of parent class
        super.disp();
    }
    public static void main(String args[]){
        //Creating the object of child class
        ChildClass1 obj = new ChildClass1();
        obj.disp();
    }
}
