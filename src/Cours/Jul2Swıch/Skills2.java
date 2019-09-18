package Cours.Jul2Swıch;

import java.util.Scanner;

public class Skills2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your skill? Java/SQL/Cloud");
        String skill = scanner.next();
        if (skill.equalsIgnoreCase("Java")) {
            System.out.print("QA score?");
            int qaScore = scanner.nextInt();
            if (qaScore >= 80) {
                System.out.println("Accepted");
            } else {
                System.out.println("Not Accepted");
            }

        } else if (skill.equals("SQL")) {
            System.out.println("Hackerrank Score");
            int hrscore = scanner.nextInt();
            if (hrscore >= 400) {
                System.out.println("Good");
            } else if (hrscore > 300 && hrscore < 400) {
                System.out.println("Not Bad");
            } else {
                System.out.println("No comment");
            }
        } else {
            System.out.println("Certification?");

        }
    }













    }