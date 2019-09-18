package InterviewQuestion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=0,m=1,k;
        int count= 14;
        System.out.print(n+" "+m);
        for (int i=2; i<count;i++){
            k=n+m;
            System.out.print(" "+k);
            n=m;
            m=k;
        }

    }



}
