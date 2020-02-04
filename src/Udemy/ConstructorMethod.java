package Udemy;

import Cours.July27Dimensional2Arrays.ColumSum;

public class ConstructorMethod {
    int radius;
    double perimeter;
    double field;
    final static double pi = 3.14;

    void writeToInformation(ConstructorMethod d) {
        System.out.println("radius of circumference   : " + d.radius);
        System.out.println("area ofcircumference     : " + d.field);
        System.out.println("perimeter of circle    : " + d.perimeter);
        System.out.println();
    }

    public ConstructorMethod(int r) {
        radius = r;
        field = pi * r * r;
        perimeter = 2 * pi * r;
    }

    public static void main(String args[]) {

        ConstructorMethod d1 = new ConstructorMethod (3);
        d1.writeToInformation (d1);
        ConstructorMethod d2 = new ConstructorMethod (11);
        d1.writeToInformation (d2);
    }
}
