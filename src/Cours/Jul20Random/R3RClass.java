package Cours.Jul20Random;

import java.util.Random;

public class R3RClass {
    public static void main(String[] args) { // 1.way or method
        for (int i=0;i<10;i++){
            System.out.print((int)(Math.random()*30)+"\t");

        }
        for (int i=0;i<10;i++){
            Random rnd=new Random();
            System.out.println(rnd.nextInt(10)+"\t");
        }


    }
}
