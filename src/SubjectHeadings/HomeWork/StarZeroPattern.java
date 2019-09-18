package SubjectHeadings.HomeWork;

public class StarZeroPattern {
    public static void main(String[] args) {

        int i=1;
        while(i<=5){

            System.out.print("0*");
            i++;

            int j=1;
            while(j<=5){
                System.out.print("o*");
                j++;
            }
            System.out.println();
        }

    }
}
