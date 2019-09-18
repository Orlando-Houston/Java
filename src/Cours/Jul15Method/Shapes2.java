package Cours.Jul15Method;

public class Shapes2 {
    public static void PrintPyramid1(int lines,String symbol) {//bunlarin yerleri semb degisebilir
        for (int i = 1; i <= lines; i++) {
            for (int j = 11; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print(symbol);
            }
            System.out.println();

        }


    }

}


