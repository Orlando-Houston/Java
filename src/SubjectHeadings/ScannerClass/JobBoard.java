package SubjectHeadings.ScannerClass;
import java.util.Scanner;

public class JobBoard {
    public static void main(String[] args){
        System.out.println("Enter your JAVA level:");
        Scanner scan = new Scanner(System.in);
        String java = scan.nextLine();
        System.out.println("Enter your SQL score:");
        int sql = scan.nextInt();
        System.out.println("Enter your experience:");
        int exp = scan.nextInt();
        job(java, sql, exp);
    }
    public static void job(String java, int sqlScore, int experience){
        int score = 0;
        if(java.equalsIgnoreCase("entry")){
            score = (500 + sqlScore) * experience;
        }
        if(java.equalsIgnoreCase("junior")){
            score = (1000 + sqlScore) * experience;
        }
        if(java.equalsIgnoreCase("senior")){
            score = (2000 + sqlScore) * experience;
        }
        if(score > 10000){
            System.out.println("We will offer $80.000");
        }
        else if(score >= 7000 && score < 10000){
            System.out.println("We will offer $60.000");
        }
        else if(score >= 5000 && score < 7000){
            System.out.println("We will offer $40.000");
        }
        else
            System.out.println("We will keep your resume for future.");
    }
}



