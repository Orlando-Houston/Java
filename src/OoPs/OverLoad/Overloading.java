package OoPs.OverLoad;

public class Overloading {
    void demo (int a)
    {
        System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
        System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}
class MethodOverloading
{
    public static void main (String args [])
    {
        Overloading Obj = new Overloading();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}
/*Here the method demo() is overloaded 3 times: first method has 1 int parameter, second method has 2 int parameters
 and third one is having double parameter. Which method is to be called is determined by the arguments
  we pass while calling methods. This happens at runtime compile time so this type of polymorphism is
  known as compile time polymorphism.
 */
