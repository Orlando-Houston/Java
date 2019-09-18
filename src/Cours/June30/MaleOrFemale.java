package Cours.June30;

import java.util.Scanner;

public class MaleOrFemale {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter F or M");

        String gender = scanner.next();
        if (gender == "m") {
            System.out.println("Male");
        } else {
            System.out.println("Female");
        }
    }
}

