package OoPs.StadDyncBinding;

public class StadBinding {
    public static void walk()
    {
        System.out.println("Human walks");
    }
}
class Boy extends StadBinding{
    public static void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        StadBinding obj = new Boy();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        StadBinding obj2 = new StadBinding();
        obj.walk();
        obj2.walk();
    }
}
