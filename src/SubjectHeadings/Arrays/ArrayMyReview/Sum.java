package SubjectHeadings.Arrays.ArrayMyReview;

public class Sum {
    public static void main(String[] args) {
        int[]myNumbers={1,2,3,4,5,6,7,8,9};

        int total=0; //empty container
        for (int i=0;i<myNumbers.length;i++){
            total=total+myNumbers[i];
        }
        System.out.println(total);

    }
}

