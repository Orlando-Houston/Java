package InterviewQuestion;

public class Pattern {
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){   //row
            System.out.print(i+" ");
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
