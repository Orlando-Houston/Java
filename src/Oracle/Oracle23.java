package Oracle;

public class Oracle23 {
    public static void main(String[] args) {
        int x=100;
        System.out.println ("x="+x);
        int a=x++;
        System.out.println ("a="+a);
        int b=++x;
        System.out.println ("b="+b);
        int c=x++;
        System.out.println ("c="+c);
      // int d=(a<b)?(a<c)?a: (b <c) ? b: c;
       // System.out.println (d);
        //compilation fails why
    }
}
