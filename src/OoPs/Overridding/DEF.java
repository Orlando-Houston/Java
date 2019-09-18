package OoPs.Overridding;

public class DEF {
    public void myMethod(){
        System.out.println("Overridden Method");
    }
}
 class XYZ extends DEF{

    public void myMethod(){
        System.out.println("Overriding Method");
    }
    public static void main(String args[]){
        DEF obj = new XYZ();
        obj.myMethod();
    }
}
