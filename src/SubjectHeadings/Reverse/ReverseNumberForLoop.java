package SubjectHeadings.Reverse;

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        int number=5432;
        int remain=0;
        int reverse=0;
        for (int i=number;number>0;number--){
            remain=number%10;
            reverse=reverse*10+remain;
            number=number/10;
        }
        System.out.println(reverse);


    }
}
