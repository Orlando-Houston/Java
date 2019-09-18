package SubjectHeadings.Arrays.CommonArray;

public class ReverseArray {
    public static void main(String[] args) {

        int no=5432,rem,rew=0;
        while (no!=0){
            rem=no%10;
            rew=rew*10+rem;
            no=no/10;
        }
        System.out.println(rew);


    }
}
