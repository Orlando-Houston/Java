package OoPs.Aug3Day33OverLoading;


public class Conversion {
    public static void main(String[] args) {
        convertLength(10);
        convertLength(10.0);
        System.out.println( convertLength2(10));
        System.out.println( convertLength2(10.0));
        convertLen("my message",10);
        convertLen(10,"second message");

    }

    public static  void convertLength(int cm) {



        System.out.println(cm+"cm is:"+ cm/2.54+"inch");

    }

    public static void convertLength(double inch) {
        System.out.println(inch + "inch is:"+inch*2.54+"inch");

    }

    public static int convertLength2(int cm) {
        return 3;
    }

    public static double convertLength2(double inch) {
        return 5;

    }

    public static void convertLen(double len,String msg) {
        System.out.println(msg+len*2.54);

    }

    public static void convertLen(String msg,double len) {
        System.out.println(msg+len/2.54);

    }


}
