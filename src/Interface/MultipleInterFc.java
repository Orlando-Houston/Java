package Interface;

public interface MultipleInterFc {
    public void myMethod1();
}
interface  MultInt{
    public void myMethod2();
}
class Demo implements MultipleInterFc,MultInt{
    public void myMethod1 (){
        System.out.println ("some text....");

    }
    public void myMethod2(){
        System.out.println ("some other text....");
    }
}
class MyIntFTest{
    public static void main(String[] args) {
        Demo myObj=new Demo ();
        myObj.myMethod1 ();
        myObj.myMethod2 ();

    }
}
