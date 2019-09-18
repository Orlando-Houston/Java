package Cours.jul28Array;
/*
        Write a method to display max value of each row in a 2-dimensional array​
        Write a method to display min value of each row in a 2-dimensional array​
        Write a method to diplay  max difference of each row in a 2-dimensional array
        */

public class MinMaxDifMax {
    public static void main(String[] args) {
        int[][] myArray = {
                {12,4324,23453,5345,436,46,456,4576,5475675,86,8768,4},
                {2,53,53,53,4534,543,654,654,65,756,756,7,46,567,8,7698},
                {456,457,576,8678,768,7689,789,8,909,9,322,87,56},
                {44,23423432,5345,46546756,75678,768,679,789,789,67856,78},
                {36,646,7567,567,5678,568,46,52452,35423,423,43,5435,435,43534,566}
        };
        int[][] result = findMinMaxDiffMax(myArray);
        for(int i=0 ; i<result.length ; i++){
            System.out.print("Max :"+ result[i][0] + " Min :" + result[i][1] + " Max Diff :" +result[i][2]);
            System.out.println();
        }
    }
    public static int[][] findMinMaxDiffMax(int[][] arr){
        int[][] resultTable = new int[arr.length][3];
        int maxValue;
        int minValue;
        int maxDiff;
        for(int i=0 ; i<arr.length ; i++){
            maxValue = arr[i][0];
            minValue = arr[i][0];
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j]>maxValue){
                    maxValue = arr[i][j];
                }
                if(arr[i][j]<minValue){
                    minValue =arr[i][j];
                }
            }
            maxDiff = maxValue-minValue;
            resultTable[i][0]=maxValue;
            resultTable[i][1]=minValue;
            resultTable[i][2]= maxDiff;
        }
        return resultTable;
    }
}







