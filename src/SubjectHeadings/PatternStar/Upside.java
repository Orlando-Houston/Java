package SubjectHeadings.PatternStar;

public class Upside {
    public static void main(String[] args) {
        int outer=1;
        int limitInner=6;
        while (outer<6){
            int inner=1;


            while (inner<limitInner){
                System.out.print("* ");
                inner++;
            }
            limitInner--;
            System.out.println();
            outer++;


        }
    }
}

