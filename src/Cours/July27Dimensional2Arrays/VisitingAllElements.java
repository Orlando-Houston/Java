package Cours.July27Dimensional2Arrays;
//2 Dimensional arrays/formula

public class VisitingAllElements {
    public static void main(String[] args) {
        int[][] multi = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi.length; j++) {
                System.out.println(multi[i][j]);
            }
        }
        String[][] names = {{"", ""}};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                System.out.println(multi[i][j]);
            }
        }
        char[][] letters = {{'a','b','c'},{'d','e','f'}};
        for(int i=0 ; i<letters.length ; i++){
            for(int j=0 ; j < letters[i].length ; j++){
                System.out.println(letters[i][j]);
            }
    }
}
}