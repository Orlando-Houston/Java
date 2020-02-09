package Oracle;

public class OBase1Inh {
    public void test(){
        System.out.println ("Base");
    }
}
class DerivedA extends OBase1Inh{
    public void test(){
        System.out.println ("DerivedA");
    }

}
class DerivedB extends DerivedA{
    public void test(){
        System.out.println ("DerivedB");
    }

    public static void main(String[] args) {
        OBase1Inh b1=new DerivedB ();
        OBase1Inh b2=new DerivedA ();
        OBase1Inh b3=new DerivedB ();
        b1=(OBase1Inh)b3;    //b2
        OBase1Inh b4= (OBase1Inh)b3;  //b4=b3   result DA DB
        b1.test ();
        b4.test ();
    }
}
