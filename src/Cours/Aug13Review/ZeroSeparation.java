package Cours.Aug13Review;

public class ZeroSeparation {
    public static void main(String[] args) {
        int[] testArray = {0,4,8,0,4,3,7,0,0,12,0};
        separateZerosNonZeros(testArray);
    }
    public static void separateZerosNonZeros(int[] array){
        int[] separated = new int[array.length];
        int index=0;
        for(int i=0 ; i<array.length ; i++){
            if(array[i]!=0){
                System.out.println(array[i]);
                index++;
            }
        }
        while(index<array.length){
            System.out.println(0);
            index++;
        }

    }

    }



