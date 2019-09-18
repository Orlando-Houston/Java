package OoPs.Overridding;
/*The super keyword is used for calling the parent class method/constructor.
 super.myMethod() calls the myMethod() method of base class while super() calls the constructor of base class.
 Let’s see the use of super in method Overriding.
As we know that we we override a method in child class, then call to the method using child class object calls
 the overridden method.
 */

public class SuperKeywordMethodOverloading {
    public void myMethod() {
        System.out.println("Overridden method");
    }
}
class Key extends SuperKeywordMethodOverloading{
    public void myMethod(){
        //This will call the myMethod() of parent class
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String args[]) {
        Key obj = new Key();
        obj.myMethod();
    }
}
