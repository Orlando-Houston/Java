package Udemy;

public class PassingDataBetweenMethods {
    public static void main(String[] args) {
        int number=4;
        System.out.println ("Number="+number);
        newNumber (number);
        System.out.println ("New Number="+number);




        String name="Jimy";
        System.out.println ("name"+name);

        newName (name);
        System.out.println ("newName"+name);




        StringBuilder sb=new StringBuilder ();

        StringBuilder s=sb;
        s.append ("Antony");
        build (sb);
        System.out.println ("String Bulider"+sb);


    }
    public static void newNumber(int number){
        System.out.println ("in new Number"+number);
        number=10;
        System.out.println ("in new number number"+number);

    }
    public static void  newName(String name){
        System.out.println ("in new name"+name);

        name="Tommy";
        System.out.println ("in new name2="+name);

    }

    public  static  void build(StringBuilder s){
      //  s=new StringBuilder ();
        s.append ("Timoty");

    }
}
