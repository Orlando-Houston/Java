package ArraysMix;

public class ArrayMax {
    public static void main(String[] args) {
        int arrayNumbers[]={99,745,2};
        System.out.println(findMax(arrayNumbers));
    }

    static int findMax(int [] arr){
        int max=arr[0];

        for(int i=1 ; i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }
        }
        return max;
    }
}
