package SubjectHeadings.PatternStar;

public class HourGlass {
    public static void main(String[] args) {//upper part
        for (int i = 1; i < 8; i++) {
            //space
            for (int j = 1; j < i; j++) {
                System.out.print("-");
            }
            //numbers
            for (int k = i; k < 8; k++) {

                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i =1;  i<7; i++) {
            //space
            for (int j = 6; j >i; j--) {
                System.out.print("-");
            }
        }
        //number
        for (int k=7-1 ;k<8;k++){

            System.out.print(k+ " ");
        }
        System.out.println();
    }



}





