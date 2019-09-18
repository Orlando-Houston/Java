package Cours.Jul29DimensionalArray;

public class Donat {
    public static void main (String[] args) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++){
                if((j>2 && j<8) && (i>2 && i<8)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

