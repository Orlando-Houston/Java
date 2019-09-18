package OoPs.Super;

public class MyParentClass {

    MyParentClass(){
        System.out.println("Parent class constructor");
    }
}
class MyChildClass extends MyParentClass{
    MyChildClass(){
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        new MyChildClass();
    }
}
