package SubjectHeadings.Reverse;

public class ReverseNumberWhileLoopReturn {
    public static int myReverse() {
        int number = 12345;
        int remainder = 0;
        int reverse = 0;
        while (number>0){
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(myReverse());
    }

}
