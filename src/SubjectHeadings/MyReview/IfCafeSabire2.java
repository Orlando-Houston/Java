package SubjectHeadings.MyReview;

import java.util.Scanner;

public class IfCafeSabire2 {

    public static Integer  printgrade1() {
        System.out.println("Enter Your Grade");
        Scanner score = new Scanner(System.in);
        int grade = score.nextInt();//girilen graydi bana score icerisinde tanimla

        if (grade >= 90) {
            System.out.println("A+");
        } else if (grade >= 80) {
            System.out.println("A");
        } else if (grade >= 70) {
            System.out.println("B");
        } else if (grade >= 60) {
            System.out.println("C");
        } else if (grade >= 50) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
        return grade;


    }

    public static void main(String[] args) {
        IfCafeSabire2.printgrade1();
        //System.out.println(IfCafeSabire2.printgrade1());
    }


}

