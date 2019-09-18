package Cours.July27Dimensional2Arrays;

public class ColumSum {
    public static void main(String[] args) {
        int list[][]=new int[10][10];
        int number=1;
        int rowSum=0;
       // int colSum=0;

        for (int i=0;i<10;i++){

            for (int j=0; j<10; j++){
                list[i][j]=number;
                System.out.printf("%4d",list[i][j]);
                number++;
                rowSum=rowSum+list[i][j];

            }
            System.out.println("Summ:"+rowSum);
            rowSum=0;
            System.out.println();

            System.out.println();

        }
        int colSum=0;
        for (int i=0;i<10;i++){

            for (int j=0; j<10; j++){
                colSum=colSum+list[j][i];
            }
            System.out.printf("%6d"+colSum);

            colSum=0;
            }



    }
}


