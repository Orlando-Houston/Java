package Cours.Jul16MethoReturn;

public class MethodExs {
    public static void main(String[] args) {

        double circPerimeter=calculatePerimeterCircle(15);
        if (circPerimeter>=20){
            System.out.println("Large Circle");
        }
        else{
            System.out.println("small circle");
        }

    }

    static double calculatePerimeterCircle(int radius) {
        double perimeter=1;
        perimeter=2*3.14*radius;
        return perimeter;

    }
}
