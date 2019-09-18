package Cours.Aug7;

public class SuperExampleExtend  extends SuperExample{

    int a=20;

    public void myMethod(int a) {
        System.out.println(super.a);
        System.out.println(this.a);
        System.out.println(a);
    }


    public static void main(String[] args) {
        SuperExampleExtend abc = new SuperExampleExtend();
        abc.myMethod(30);
    }
}
