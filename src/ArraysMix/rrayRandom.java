package ArraysMix;

public class rrayRandom {
    public static void main(String[] args) {
        createArrayWithRandoms(100);
    }

    public static void createArrayWithRandoms(int n){
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=1000+(int)(Math.random()*4001);
        }
        //just to see the array elements
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
