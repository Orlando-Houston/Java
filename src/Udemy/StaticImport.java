package Udemy;

import static Udemy.Config.*;
import static java.lang.Math.min;

public class StaticImport {
    public static void main(String[] args) {
        int min=min(5,7);
        System.out.println ("min="+min);


        printConfig();//because  it is static

        System.out.println (NAME);
        System.out.println (MAX_COLUMN_COUNT);
    }
}
