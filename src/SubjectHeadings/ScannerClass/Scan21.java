package SubjectHeadings.ScannerClass;

import java.util.Scanner;

public class
Scan21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is your skill? Java/SQL/Cloud");
        String skill=scanner.next();
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

