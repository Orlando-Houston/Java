package OoPs.Super;

public class ParentClass2 {
    //Overridden method
    void display(){
        System.out.println("Parent class method");
    }
}
class Subclass3 extends ParentClass2
{
    //Overriding method
    void display(){
        System.out.println("Child class method");
    }
    void printMsg(){
        //This would call Overriding method
        display();
        //This would call Overridden method
        super.display();
    }
    public static void main(String args[]){
        Subclass3 obj= new Subclass3();
        obj.printMsg();
    }}
