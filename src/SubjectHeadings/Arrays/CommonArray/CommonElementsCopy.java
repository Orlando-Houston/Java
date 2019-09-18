package SubjectHeadings.Arrays.CommonArray;

public class CommonElementsCopy {
    public static void main(String[] args) {
        int[] array1 = {1,345,2392,2332,33423,4,5,6,6}; //  Array1 to test our Methods (parameter)
        int[] array2 = {4,5,6,67585,424,345345,674564,2342,2332}; //Array to test our Methods (parameter)
        findCommon(array1,array1); //void method is called
        int[] resultArray = finCommonInts(array1,array2); //int method is called


    }
    //void Method to find common elements in 2 arrays
    public static void findCommon(int[] arr1,int arr2[]){
        for(int i=0 ; i<arr1.length ; i++){ //visits of the array1
            for(int j=0 ; j<arr2.length ; j++){ //visits of the array2
                if(arr1[i]==arr2[j]){ //checking is the elements are the same?
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    //int method
    public static int[] finCommonInts(int[] arr1,int[] arr2){
        int size = 0;
        //choosing shorter array's length
        if(arr1.length<arr2.length){
            size = arr1.length;
        }
        else {
            size = arr2.length;
        }
        int[] returnArray = new int[size];
        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]) {
                    returnArray[i] = arr1[i];
                }
            }
        }
        return returnArray;
    }
}


