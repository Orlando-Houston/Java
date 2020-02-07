package Oracle;

public class O57Arr {
    public static void main(String[] args) {
        int number[][]=new int[1][3];//2 dimensions array//row number1//column number3
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number.length;j++){
                number[i][j]=10;
                System.out.println ();

              //  result:
                number[0][0]=10;
                number[0][1]=10;
                number[0][2]=10;

            }
        }
    }
}
