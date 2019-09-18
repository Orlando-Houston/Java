package SubjectHeadings.Arrays.CommonArray;

public class CommonElementsTeach {
    public static void main(String[] args) {
        int[]array1={1,2,3,4,5,6,7,8,9};
        int[]array2={2,5,15,67,58,11,89};
        findCommon(array1,array1);
        int[] resultArray=findCommonInts(array1,array2);

    }

    public static void findCommon(int[]array1,int[]array2) {
        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array1[i]==array2[j]){
                    System.out.println(array1);
                }
            }
        }

    }

    public static int[] findCommonInts(int[]arr1,int[]arry2) {
        int size = 0;
        if (arr1.length < arry2.length) {

        } else {
            size = arry2.length;
        }
        int[] returnArray = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arry2.length; j++) {
                if (arr1[i] == arry2[j]) {

                }
            }
        }
        return returnArray;
    }
}





