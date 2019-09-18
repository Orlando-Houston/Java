package Cours.June30;

public class JobApplication {
    public static void main (String[]args){

        int age=28;
        int JavaPoint=95;
        double score=0;
        if ((age>=20 && age<=30) && JavaPoint>=80){
            score=age *1.5 +JavaPoint * 4.5;

        }else if ((age>=20&&age<=30)&&JavaPoint<80){
            score=age*1.5+JavaPoint *3.5;

        }else if (age>30 && JavaPoint >=80){
            score=age *1.1 +JavaPoint *3.5;
        }
        else{
            System.out.println("Your age is not acceptable for this job");
        }
                System.out.println("Your  score is:"+score);

    }
}





