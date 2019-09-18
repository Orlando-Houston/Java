package SubjectHeadings.Reverse;

public class ReverseNumbWhileLoop {
    public static void main(String[] args) {
        int number=5432,rem=0,rew=0;
        while (number>0){
            rem=number%10;
            rew=rew*10+rem;
            number=number/10;
        }
        System.out.println(rew);

    }
}
// this topic studied.
