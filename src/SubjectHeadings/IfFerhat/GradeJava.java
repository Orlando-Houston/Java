package SubjectHeadings.IfFerhat;

public class GradeJava {
    public static void  main(String[]args) {
        int grade = 96;
        if (grade >= 90 && grade <= 100) System.out.println("A+");
        else if (grade >= 80 && grade <= 89) System.out.println("A");
        else if (grade >= 70 && grade <= 79) System.out.println("A+");
        else if (grade >= 60 && grade <= 69) System.out.println("A+");
        else if (grade >= 50 && grade <= 59) System.out.println("A+");
        else if (grade >= 0 && grade <= 49) System.out.println("A+");
        else System.out.println("Not valid grade");

    }

}

