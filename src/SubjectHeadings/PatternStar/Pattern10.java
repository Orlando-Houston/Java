package SubjectHeadings.PatternStar;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){               //rows

            for (int j=3;j>=i;j--){            //space
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){            //stars
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

