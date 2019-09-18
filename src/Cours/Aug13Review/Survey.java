package Cours.Aug13Review;

import java.util.Scanner;

public class Survey {
    public static void startSurvey() {
        String[]questions={"How perfect you are 1-10",
                "I don't listen others 1-10",
                "I don't care about others 1-10"};
        int[] answers=new int [questions.length];
        Scanner mySurvey=new Scanner(System.in);

        for (int i=0;i<questions.length;i++){
            System.out.println(questions[i]);
            answers[i]=mySurvey.nextInt();
        }
        int score=0;     //en son burayi yazdik we last typed this part

    }

    public static void main(String[] args) {
        startSurvey();
    }
}
