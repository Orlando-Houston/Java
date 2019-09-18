package SubjectHeadings.Duplicate;

public class DuplicateRemoving {
    public static void main(String[] args) {
        int[] sample = {1,2,3,4,5,6,4,5};
        removeDuplicates(sample);
    }

    public static void removeDuplicates(int[] arr){
        int[] emptyArr = new int[arr.length]; //create new empty array with the same size original array
        for(int i=0 ; i<arr.length ; i++){
            if(isExist(emptyArr,arr[i])){ //check whether you have same value in empty array or not
                emptyArr[i]=arr[i]; // if it is not exist than move current element
            }
        }
        //print new Array
        for(int element:emptyArr){
            System.out.print(element+" ");
        }
    }
    public static boolean isExist(int[] arrayToCheck,int elementToCheck){
        boolean check =true;
        for(int i=0 ; i < arrayToCheck.length ; i++){
            if(elementToCheck==arrayToCheck[i]){
                check=false;
            }
        }
        return check;
    }
}

