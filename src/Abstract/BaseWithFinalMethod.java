package Abstract;

public class BaseWithFinalMethod {
    final  void delight(){
        System.out.println ("Derived delight() called");

    }
}
class Derived3 extends BaseWithFinalMethod{

}
class BaseTest3{
    public static void main(String[] args) {

        BaseWithFinalMethod bfm=new BaseWithFinalMethod ();
        bfm.delight ();


        BaseWithFinalMethod bf= new Derived3 ();
        bf.delight ();
    }
}
//abstract class can also have final methods(methods that can not be overridden).
