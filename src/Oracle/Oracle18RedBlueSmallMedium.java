package Oracle;

public class Oracle18RedBlueSmallMedium {
    public static void main(String[] args) {
        String shirt[][] = new String[2][2];
        shirt[0][0] = "red";
        shirt[0][1] = "blue";
        shirt[1][0] = "small";
        shirt[1][1] = "medium";
        //which code fragment print red,blue,small,medium

        for (int index = 0; index < 2; ++index) {
            for (int idx = 0; idx < 2; ++idx) {
                System.out.print (shirt[index][idx] + ":");


                // for (int index = 0; index <shirt.length; ) {
                // for (int idx = 0; idx < shirt.length; ) {
                //  System.out.print (shirt[index][idx] + ":");
                // idx++;
                //   }
                // index++;


            }
        }}}

//two dimensional array
