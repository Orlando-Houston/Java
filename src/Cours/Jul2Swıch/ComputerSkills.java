package Cours.Jul2Swıch;

import java.util.Scanner;

public class ComputerSkills {
    public static void main(String[] args) {
        Scanner compSkill=new Scanner(System.in);
        System.out.print("What is your skill? Java/SQL/Cloud");
        String skill=compSkill.next();

        if (skill.equals("Java")){
            System.out.print("QA");

        }
        else if (skill.equals("SQL")){
            System.out.println("Hackerrank Score");
        }
        else{
            System.out.println("Certification");
        }
    }
}

