package Abstract;

public abstract class BaseWithConstructor {
    BaseWithConstructor(){
        System.out.println ("Base constructor called");
    }

    abstract void  joy();//doesn't have  any body
}
class Derived1 extends BaseWithConstructor{
    Derived1(){
        System.out.println ("Derived constructor called");
    }
    void joy(){
        System.out.println ("derived fun() called");
    }
}
class BaseTest{
    public static void main(String[] args) {
        Derived1 d=new Derived1 ();
    }

}
