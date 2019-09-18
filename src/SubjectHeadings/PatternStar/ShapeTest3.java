package SubjectHeadings.PatternStar;

import Cours.Jul15Method.Shapes2;

import java.util.Scanner;

public class ShapeTest3 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("number of lines?");
        int linesPyramid1=scanner.nextInt(); // first this wrote.proces make
        System.out.print("Symbol of the Pyramid?");
        String symbolPyramid1=scanner.next();
        Shapes2.PrintPyramid1(linesPyramid1,symbolPyramid1); //shapes2 pattern calisiliyor
        // Shapes.printUpSideDownPyramid(); //1hour 6.`


    }





}

