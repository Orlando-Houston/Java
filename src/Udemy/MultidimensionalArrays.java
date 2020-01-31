package Udemy;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //1 dim array
        int []arr={0,1};
        //2 dim arrays
        int[][]myArr=new int[2][4];//2 rows 4 columns

        int []myArray[]=new int[2][4]; //valid but unpratical


        String[][]otherArr=new String[][]{
                {"on","two"},//1.row 2 elements
                {"three","four","five"},//2.row 3 elements
                {" "," "," "," "," "},//3.row with 4 elements
                null   //4. nothing element
        };
        int[][]numberTable=new int[2][3];//2 row 3 columns
        numberTable[0][0]=1;
        numberTable[0][1]=2;
        numberTable[0][2]=3;
      //  numberTable[0][3]=4; //out of bounds

        //3d array
        //pages(planes),rows,columns
        int[][][]threeArray=new int[3][3][3];
        int oneMoreThreeArray[][][]=new int[3][3][3];


        int[]anotherThreeArray[][];


        int[][][] threeDArray={
                {{1,2,3},{4,5,6},{7,8,9}},
                {{10,11,12},{13,14,15},{16,17,18}},
                {{19,20,21},{22,23,24},{25,26,27}}

        };

    }
}
