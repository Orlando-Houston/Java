package SubjectHeadings.PatternStar;

public class Shapes {
    public static void PrintPyramid() {
        for (int i = 1; i <= 11; i++) {
            for (int j = 11; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }


    //lines
    public static void printUpSideDownPyramid() {

        int limit=19;
        for (int i=1 ; i<=11;i++) {

            //spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //Stars
            for (int k=limit;k>0;k--){
                System.out.print("*");
            }
            limit=limit-2;
            System.out.println();


        }

    }
}

