package Cours.Aug5;

public class ArrayClassConst {
    int size;
    public ArrayClassConst(){
        this.size=10;
    }
    public ArrayClassConst(int size){
        this.size = size;
    }
    public int[] initialArray(){
        int[] returnArray = new int[this.size];
        for(int i=0; i<this.size;i++){
            returnArray[i]=i+1;
        }
        return returnArray;
    }
    public void printOddIndexes(int[] array){
        for(int i=0 ; i< array.length;i++){
            if(i%2!=0){
                System.out.println(array[i]);
            }
        }
    }
    public void printEvenIndexes(int[] array){
        for(int i=0; i<array.length;i++){
            if(i%2==0){
                System.out.println(array[i]);
            }
        }
    }
}