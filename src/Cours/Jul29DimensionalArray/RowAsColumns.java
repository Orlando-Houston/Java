package Cours.Jul29DimensionalArray;
/*
Write a method returns 2D array columns as rows and rows as columns​
Sample ​
Output:​
 */



public class RowAsColumns {
    public static void main(String[] args) {
        int[][] inputArray = {
                {1,2,3,30},
                {4,5,6,60},
                {7,8,9,90}
        };
        int[][]outputArray = returnColumsAsRows(inputArray);
        for(int i=0 ; i<outputArray.length ; i++){
            for(int j=0 ; j<outputArray[i].length ; j++){
                System.out.print(outputArray[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] returnColumsAsRows(int[][] arr){
        int[][] resultArray = new int[arr[0].length][arr.length]; //to get sizes opposite
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                resultArray[j][i] = arr[i][j]; //assign row values as column values visa versa
            }
        }
        return resultArray;

    }
}




