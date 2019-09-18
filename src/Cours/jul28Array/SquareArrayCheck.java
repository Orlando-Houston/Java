package Cours.jul28Array;

public class SquareArrayCheck {
    public static void main(String[] args) {
        int[][]myArray={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(isSquare(myArray));

    }


    public static boolean isSquare(int[][] arr) {
        boolean square=true;
        int arrayLength=arr.length;
        for (int i=0; i<arrayLength;i++){
            if (arrayLength!=arr[i].length){
                square=false;

        }
        }
        return square;
    }
}
