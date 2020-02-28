package Abstract;
//An Abstract class without any abstract method

public class BaseWithoutAbstractMethod {
    void enjoy(){
        System.out.println ("Base enjoy() called");
    }

}
class Derived2 extends BaseWithoutAbstractMethod{

}
class BaseTest2{
    public static void main(String[] args) {

        //in java ,we can have an abstarct class without any abstract method.This allows
        // us to create classes that cannot be instantiated ,but can only inherited
        Derived2 d2= new Derived2 ();
        d2.enjoy ();
    }
}
