package Oracle;

import javax.swing.*;

public class O48ArrForBrCont {
    public static void main(String[] args) {

        String[][]letter={{"A","B","C"},{"D","E"}}; //2 dimensional array
        for (int i=0;i<letter.length;i++){
            for (int j=0;j<letter.length;j++){
                System.out.print (letter[i][j]+" ");
                if (letter[i][j].equals ("B")){
                    break;
                }
            }
            continue;
        }


}}
