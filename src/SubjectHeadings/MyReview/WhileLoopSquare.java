package SubjectHeadings.MyReview;

public class WhileLoopSquare {
    public static void main(String[] args) {
        /*
        int rows=1;
        while(rows<=4){
            rows++;
            System.out.print("^");
            int column=1;
            while (column<4){
                column++;
                System.out.print("^");
            }
            System.out.println();

        }*/
        int i=0;   //rows   dik ucgen
        while(i<=10){
            i++;
            System.out.print("");

            int j=1;  //column
            while(j<=i){          //ters dik ucgen yapmak icinj>=i ve azalarak devam edecek..
                j++;
                System.out.print("* ");
                /*

                int k=10;   //space
                while(k<0){
                    k--;
                    System.out.print("-");

                 */

                }
                System.out.println();



            }
        }

    }

