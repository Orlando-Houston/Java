package Udemy;

public class WrapperBoolean {
    public static void main(String[] args)
    {
        // parsing different Strings
        boolean b1 = Boolean.parseBoolean("True");
        boolean b2 = Boolean.parseBoolean("TruE");
        boolean b3 = Boolean.parseBoolean("False");
        boolean b4 = Boolean.parseBoolean("FALSE");
        boolean b5 = Boolean.parseBoolean("GeeksForGeeks");


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        // creating different Boolean objects
        Boolean b6 = new Boolean("True");
        Boolean b7 = new Boolean("False");
        Boolean b8 = new Boolean("GeeksForGeeks");



        // getting primitive boolean value
        boolean b9 = b6.booleanValue ();
        boolean b10 = b7.booleanValue();
        boolean b11 = b8.booleanValue();

        System.out.println (b9);
        System.out.println (b10);
        System.out.println (b11);


        // creating boolean variable
        boolean b12 = true;
        boolean b13 = false;

        // getting Boolean objects from boolean variables
        Boolean b14 = Boolean.valueOf(b12);
        Boolean b15 = Boolean.valueOf(b13);

        System.out.println(b14);
        System.out.println(b15);


    }
}
