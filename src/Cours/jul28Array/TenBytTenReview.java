/*
1) Create an int 10X10 array and put values from 1 to 100​
2) print sum of all rows​
3) print sum of all columns​
4) print numbers divisible by 4​
5) print numbers as triangle
 */
package Cours.jul28Array;

public class TenBytTenReview {
    public static void main(String[] args) {
        int[][] arrayTenByTen = createArray(10,10);//10X10 with numbers 1-100 array created
        printMultiArray(arrayTenByTen); // all items of the array printed
        int[] sums = sumOfTheRows(arrayTenByTen); //returns sum of all rows as 1 dimensional array
        printDivisibleByFour(arrayTenByTen); //prints elements divisible by 4
        printAsTriangle(arrayTenByTen); // prints elements shapes triangle
        int[] colSums = findColumnSums(arrayTenByTen); // finds Sims of the columns and returns as array
        //to print all elements of the colSums array
        for(int colSum:colSums){
            System.out.println(colSum);
        }
    }

    //creating 10X10 array with values 1-100
    public static int[][] createArray(int row, int col){
        int[][] numbers = new int[row][col]; //initial part
        int number = 1;//numbers to put inside
        for(int i=0 ; i<row ; i++){
            for (int j=0 ; j<col ; j++){
                numbers[i][j] = number;
                number++; //increment
            }
        }
        return numbers;
    }
    //to print all elements of the 2D array
    public static void printMultiArray(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            int [] array = arr[i];
            for(int num:array){
                System.out.printf("%5s",num);
            }
            System.out.println();
        }
    }
    public static int[] sumOfTheRows(int[][] array){
        int rowSum=0;//initial part
        int[] resultArray = new int[array.length];
        for(int i=0 ; i<array.length ; i++){
            for(int j=0 ; j<array[i].length ; j++){
                rowSum = rowSum + array[i][j]; // calculating sum of the current array's elements
            }
            resultArray[i] = rowSum ; //assigning sum of the current row
            rowSum = 0;
        }
        return resultArray;
    }
    public static void printDivisibleByFour(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<arr[i].length ; j++){
                if(arr[i][j]%4==0){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    public static void printAsTriangle(int[][] arr){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(j<=i){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    //this nested loops for column Sum
    public static int[] findColumnSums(int[][] arr){
        int[] resultArray = new int[arr[0].length];
        int colSum=0;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                colSum = colSum + arr[j][i];
            }
            resultArray[i] = colSum;
            colSum =0;
        }
        return resultArray;
    }
}