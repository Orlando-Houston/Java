package SubjectHeadings.Arrays.ArrayMyReview;

public class FindMinArray {
    public static void main(String[] args) {
        int[]myArr={1,2,3,4,5,6,7,8,9};
        int min=findMinValue(myArr);
        System.out.println(min);

    }

    public static int findMinValue(int[]arr) {
        int container = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < container) {
                container = arr[i];//contenirdaki degisiklikleri ifade eder


            }


        return container;


    }}



