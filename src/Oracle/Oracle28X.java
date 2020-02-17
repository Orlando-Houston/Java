package Oracle;

public class Oracle28X {
    static  int i;
    int j;

    public static void main(String[] args) {
        Oracle28X x1=new Oracle28X ();
        Oracle28X x2=new Oracle28X ();
        x1.i=3;
        x1.j=4;
        x2.i=5;
        x2.j=6;
        System.out.println (x1.i+""+x1.j+""+x2.i+""+x2.j);
    }
}
