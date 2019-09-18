package Cours.Jul6ForAndWhile;

import java.util.Scanner;

public class OddEvenFivesWhitFor {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                System.out.println("Odd number=" + 1);


            } else {
                System.out.println("Even Number=" + i);

            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter start ");
        int start = scanner.nextInt();

        System.out.println("Please enter end");
        int end = scanner.nextInt();


        System.out.println("Please enter step");
        int step = scanner.nextInt();

        if (start < end) {
            for (int j = start; j <= end; j = j + step) {
                System.out.println(j);

            }

        } else {
            System.out.println("start should be less  then end");
        }
    }
        }







