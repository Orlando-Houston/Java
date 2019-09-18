package SubjectHeadings.PatternStar;

public class Shapes1 {
    public static void main(String[] args) {


        Cours.Jul15Method.Shapes1.printDownPyramidModified(9);
    }
    public static void printDownPyramidModified(int lines) {

        int limit=19;
        for (int i=1 ; i<=lines;i++) {

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


