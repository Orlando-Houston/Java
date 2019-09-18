package Cours.July27Dimensional2Arrays;

public class Triangle {
    public static void main(String[] args) {
        int list[][] = new int[10][10];
            for (int j = 0; j < 10; j++) {
                for (int i = 0; i < 10; i++) {
                if (list[i][j] % 4 == 0) {


                        System.out.printf("%4d",list[i][j]);

                }
            }
        }
    }}
