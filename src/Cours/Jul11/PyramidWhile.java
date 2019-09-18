package Cours.Jul11;

public class PyramidWhile {
    public static void main(String[] args) {

        int lines=1;
        int limit=7;
        int numberOfStars=1;
        while (lines<8){


            int space=limit;
            while(space>1){

                System.out.print(" ");

                space--;
            }

            int stars=1;

            while (stars<=numberOfStars){
                System.out.print("*");
                stars++;
            }
            System.out.println();
            lines++;
            limit--;
            numberOfStars = numberOfStars+2;

        }

    }
}
