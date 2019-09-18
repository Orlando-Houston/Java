package OoPs.Abstract;

 abstract class AbstractDemo {
    public void myMethod(){
        System.out.println("Hello");
    }
    abstract public void anotherMethod();
}
 class Demo3 extends AbstractDemo{

    public void anotherMethod() {
        System.out.print("OoPs.Abstract method");
    }
    public static void main(String args[]) {



    }
}
