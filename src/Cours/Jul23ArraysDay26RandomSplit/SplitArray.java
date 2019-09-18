package Cours.Jul23ArraysDay26RandomSplit;

public class SplitArray {
    public static void main(String[] args) {
        int[]myArr={1,2,3,4,5,6,7,8,9,10};

        int lengthArray=myArr.length;  //to calculate length of input array
        int halfLength=lengthArray/2;// to use array inizilation
        int index=0;
        int[]array1=new int[halfLength];
        int[]array2=new int[halfLength];


        for (int i=0;i<lengthArray;i++){

            if (i<halfLength){
                array1[index]=myArr[i];
            }
            else{
                array2[index]=myArr[i];
            }
            index++;
            if (index>=halfLength){
                index=0;

            }
    }
        for (int i=0;i<halfLength;i++){
            System.out.print(array1[i]);
        }
        System.out.println();

        for (int j=0; j<halfLength;j++){
            System.out.print(array2[j]);
        }
    }
}

