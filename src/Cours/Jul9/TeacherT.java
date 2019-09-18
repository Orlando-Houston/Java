package Cours.Jul9;

import java.util.Scanner;

public class TeacherT {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many lines");
        int rows=scanner.nextInt();
        int count=0;
        while (count<rows){
            int countInner=0;

            while (countInner<count){
                System.out.println("* ");
                countInner++;
            }
            System.out.println();
            count++;
        }

    }
}
