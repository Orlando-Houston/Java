package Cours.July27Dimensional2Arrays;

public class FirstMultiDimensionalArray {
    public static void main(String[] args) {
        int[][] multi = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0 ; i<multi.length ; i++){
            for(int j=0 ; j<multi[i].length ; j++){
                System.out.println(multi[i][j]);
            }
        }
        String[][] names = {{"James","Alice"},{"Wilson","Jenifer"},{"Michael","David","Angela"}};
        for(int i=0 ; i<names.length ; i++){
            for(int j=0 ; j<names[i].length ; j++){
                System.out.println(names[i][j]);
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

