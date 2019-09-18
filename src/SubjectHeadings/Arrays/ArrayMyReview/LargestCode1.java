package SubjectHeadings.Arrays.ArrayMyReview;

public class LargestCode1 {
    static   int arr[]={12,13,1,14,10,16};
    static int largest(){

        int i;
        int max=arr[0];
        for (i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }}


