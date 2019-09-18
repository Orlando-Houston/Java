package Cours.Jul29DimensionalArray;

public class Donat1 {
    public static void main (String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++){
                if( (i>1 && i<9) && (j>1 && j<9) ) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("*********");
        for(int i=1 ; i<10 ; i++){
            System.out.println("*       *");
        }
        System.out.println("*********");
    }
}

