package Cours.Aug8;

public class ArraysTest {
    public static void main(String[] args) {

        ArrayOverLoding myArr = new ArrayOverLoding();
        int[] paramArray={1,2,3,4,5,6,7,8,9};
        System.out.println(myArr.returnIndex(paramArray,5));

        StatArrays myStat=new StatArrays();
        System.out.println(myStat.returnAverage(paramArray));
        System.out.println(myStat.returnmax(paramArray));
        System.out.println(myStat.returnMin(paramArray));


    }
}
