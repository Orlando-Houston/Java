package Cours.Jul30Exception;


import java.util.Scanner;

public class ArrayExeptionWithMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("row index : ");
        int row = scan.nextInt();
        System.out.print("column index : ");
        int column = scan.nextInt();

        System.out.println(giveMeValue(row,column));

        System.out.println("Next line in my codes");
    }
    public static String giveMeValue(int rowIndex,int columnIndex){
        String result="";
        int[][] myArray = {
                {1,2,3,4,5,6},
                {423,4242,32,4345435,7567567,7868,68,68,786},
                {4,7576,876,8768,679,7978,9,85,6454,234,2},
                {4,256546,63,7}
        };
        try {
            result = result + myArray[rowIndex][columnIndex];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index bound(s) exceeded");
        }


        return result;
    }
}

