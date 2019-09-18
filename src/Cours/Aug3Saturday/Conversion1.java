package Cours.Aug3Saturday;

public class Conversion1 {
    public static void main(String[] args) {
        convertLength(10);
        convertLength(10.0);
        convertLen("Cm to inch ",10);
        convertLen(10, "inch to cm");
    }
    public static void convertLength(int cm){
        System.out.println(cm + " cm is : "+ cm/2.54 + " inch");
    }
    public static void  convertLength(double inch){
        System.out.println(inch + " inch is : "+inch*2.54 + " cm");
    }

    public static void convertLen(double len,String msg){
        System.out.println(msg + len*2.54);
    }
    public static void convertLen(String msg, double len){
        System.out.println(msg + len/2.54);
    }

}

