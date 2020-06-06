package OoPs.Inheritance;

public class ABCDTest {
    public static void main(String[] args) {
        A ob1 = new A();
        System.out.println(ob1.getA());
        B obj2 = new B();
        System.out.println(obj2.getA());
        C obj3 = new C();
        System.out.println(obj3.getA());
        obj3.setA(40);
        obj2.setA(60);
        System.out.println(ob1.getA());
        System.out.println(obj2.getA());
        System.out.println(obj3.getA());
    }
}
