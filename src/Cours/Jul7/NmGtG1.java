package Cours.Jul7;

import java.util.Scanner;

public class NmGtG1 {
    public static void main(String[] args) {
        int numberToGuest = 101;

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Guess?:");
        boolean guess = true;
        while (guess) {
            for (int i = 1; i < 4; i++) {
                int userNumber = numberInput.nextInt();
                if (numberToGuest == userNumber) {
                    System.out.println("CONGRATS");
                    guess=false;


                } else if (numberToGuest < userNumber) {
                    System.out.println("larger try again");


                } else {
                    System.out.println("Smaller.Try again");

                }
                //start++;
            }
        }
    }
}
