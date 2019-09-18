package Cours.june2829;

public class TriangleCheckingIf {
    public static void  main(String[]args){
        int side1=1000;
        int side2=120;
        int side3=140;
        if(side1+side2>side3&&side1+side3>side2&&side2+side3>side1){
            System.out.println("This sides can form a triangle");
        }
        else {
            System.out.println("Sory this sides can not form a triangle!");


        }
    }
}

