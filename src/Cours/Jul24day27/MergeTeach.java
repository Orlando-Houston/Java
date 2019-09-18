package Cours.Jul24day27;

public class MergeTeach {
    public static void main(String[] args) {
        int[]list={1,3,5,7,9};
        int[]list1={11,13,15,17};

        System.out.println( );



    }

    public static  int[]mergeTwoArrays(int[]list,int[]list1) {
        int size=list.length+list1.length;
        int[]mergedArray=new int[size];
        int index=0;

        for (int i=0;i< mergedArray.length;i++){
            mergedArray[i]=list[i];
            index++;
        }
        for(int j=0;j<list1.length;j++){
            mergedArray[index]=list1[j];
            index++;
        }
        return mergedArray;

    }
}
