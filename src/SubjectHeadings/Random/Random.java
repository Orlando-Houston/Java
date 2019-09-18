package SubjectHeadings.Random;

public class Random {
    public static void main(String[] args) {
        int list[][]=new int[10][10];
        int number=1;

        for (int i=0;i<10;i++){

            for (int j=0; j<10; j++){
                list[i][j]=number;
                System.out.printf("%4d",list[i][j]);
                number++;
            }
            System.out.println();

        }

    }

}
