package SubjectHeadings.Arrays.CommonArray;

public class ToFindMinOrMax {
    int[]myList1={1,3,5,7,9,11,13,19};
    static int getMin(int myList1[],int length) {  ///getMax
        int res = myList1[0];
        for (int i = 1; i < myList1.length; i++) {
            res = Math.min(res, myList1[i]);  ///Math.max



        }
        return res;
    }

    public static void main(String[] args) {

    }
}
