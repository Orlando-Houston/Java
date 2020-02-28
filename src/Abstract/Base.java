package Abstract;

public abstract class Base {
    abstract void  fun();//doesn't have  any body
}
class Derived extends Base{
    void fun (){
        System.out.println ("Derived fun() called");
    }
}
class Main{
    public static void main(String[] args) {
      //  Base b=new Base();
        //we can have referances of Base type
        Base b=new Derived ();
        b.fun ();

        Derived d= new Derived ();
        d.fun ();
    }
}
