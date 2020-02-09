package Oracle;

public class O4ArrayMaxVFind {
    public static void main(String[] args) {
        int numbers[]={12,13,45,17,145,3,67};
        int max=findMax (numbers);
    }
    public static int findMax(int[]numbers){
        int max=0;
        for (int i=0;i<numbers.length;i++){
            if (numbers[i]>max){
                max=numbers[i];
            }

        }
        return max;

    }
}
