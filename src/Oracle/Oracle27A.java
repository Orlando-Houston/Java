package Oracle;




public class Oracle27A {
    public Oracle27A(){
        System.out.println ("Oracle27A");
    }


}
class B extends Oracle27A{
    public B(){                      //line n1
        System.out.println ("B");
    }
}
class C extends B{
    public C(){     //line2
        System.out.println ("C");
    }

    public static void main(String[] args) {
        C c=new C();
    }
}
