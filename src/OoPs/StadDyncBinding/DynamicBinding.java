package OoPs.StadDyncBinding;

public class DynamicBinding {
    //Overridden Method
    public void walk()
    {
        System.out.println("Human walks");
    }
}
class Demo extends DynamicBinding{
    //Overriding Method
    public void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        DynamicBinding obj = new Demo();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        DynamicBinding obj2 = new DynamicBinding();
        obj.walk();
        obj2.walk();
    }
}
/*Static binding happens at compile-time while dynamic binding happens at runtime.
Binding of private, static and final methods always happen at compile time
since these methods cannot be overridden. When the method overriding is actually
 happening and the reference of parent type is assigned to the object of child class type
 then such binding is resolved during runtime.
 */


