package SubjectHeadings.PatternStar;

public class While {
    public static void main(String[] args) {
        int lines=1;
        do {
            int space=10;
            do {
                System.out.print(" ");
                space--;


            }while (space>lines);

            int stars=1;
            do {
                System.out.print("*");

                stars++;

            }while (stars<=2*lines-1);


            System.out.println();
            lines++;

        }while (lines<10);
    }
}


