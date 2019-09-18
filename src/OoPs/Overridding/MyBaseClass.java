package OoPs.Overridding;

public class MyBaseClass {
    public void disp()
    {
        System.out.println("Parent class method");
    }
}
class MyChildClass extends MyBaseClass{
    public void disp(){    //protected oldugu zaman error veriyor
        System.out.println("Child class method");
    }
    public static void main( String args[]) {
        MyChildClass obj = new MyChildClass();
        obj.disp();
    }
}
