package Cours.Aug3Saturday;

public class Conversion {
    public static void main(String[] args) {
        convertLength(10);
        convertLength(10.0);
    }
    public static void convertLength(int cm){
        System.out.println(cm + " cm is : "+ cm/2.54 + " inch");
    }
    public static void  convertLength(double inch){
        System.out.println(inch + " inch is : "+inch*2.54 + " cm");
    }

}

