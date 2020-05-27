package ArraysMix;

public class ArrayMerging {
    public static void main(String[] args) {
        int array1[]={1,2,3,7,9,0,0,0};
        int array2[]={4,5,6};
        mergeArrays(array1,array2);
    }

    static void mergeArrays(int a[],int b[]){
        int lenMergedArray = a.length+b.length;
        //System.out.println(lenMergedArray);
        int[] mergedArray = new int[lenMergedArray];
        //adding values of the first array (array a)
        for(int i=0;i<a.length;i++){
            mergedArray[i]=a[i];
        }
        //adding elements of the second array (array b)
        int index=0;
        for(int i=a.length;i<mergedArray.length;i++){
            mergedArray[i]=b[index];
            index++;
        }
        //to print (show) elements
        for(int i=0;i<mergedArray.length;i++){
            System.out.println(mergedArray[i]);
        }

    }
}
