package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class Scan32 {
    public static void main(String[] args) {
        int numberToGuest = 101;

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Guess?:");
        //int start=0;
        for (int i = 1; i < 4; i++) {
            int userNumber = numberInput.nextInt();
            if (numberToGuest == userNumber) {
                System.out.println("CONGRATS");


            } else if (numberToGuest < userNumber) {
                System.out.println("larger try again");


            } else {
                System.out.println("Smaller.Try again");

            }


        }
    }}
