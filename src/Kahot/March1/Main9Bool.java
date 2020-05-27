package Kahot.March1;

import javax.swing.*;

public class Main9Bool {
    public static void main(String[] args) {
        int[] a={1,2,34,5,6};
        int[] b={2,4,6,8,10,12};
        boolean isIT=true;
        for (int i=0;i<a.length;i++){
            if (b[i]!=2*a[i]){
                isIT=false;
            }
    }
        if (isIT){
            System.out.println ("Ok");
        }
        else{
            System.out.println ("Not Okey");
        }



    }
}
