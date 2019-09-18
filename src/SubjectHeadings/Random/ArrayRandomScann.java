package SubjectHeadings.Random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandomScann {
    public static void main(String[] args) {
        Scanner enterNumber = new Scanner(System.in);
        Random randomNumber = new Random();

        int backup, howManyNumber, Numbers[];
        System.out.println("How many numbers:");

        howManyNumber = enterNumber.nextInt();
        Numbers = new int[howManyNumber];
        for (int i = 0; i < howManyNumber; i++) {
            Numbers[i] = randomNumber.nextInt(101); //0 ile 100 arasinda
        }
        for (int i = 0; i < howManyNumber; i++) {
            Arrays.sort(Numbers);

            System.out.print(Numbers[i]+"-");


        }


    }


}


