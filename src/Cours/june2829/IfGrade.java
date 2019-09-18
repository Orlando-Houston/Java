package Cours.june2829;
import java.util.Scanner;
public class IfGrade {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Your grade Enter:");
        int grade=scan.nextInt();
        if (grade>90){
            System.out.println("Your pass the class..Your grade AA");

        }
        else if(grade>80){
            System.out.println("Your pass the class...Your grade BA");

        }
        else if(grade> 70){
            System.out.println("Your pas the class......Your grade BB");
        }
        else{
            System.out.println("Dersten kaldiniz");






        }


    }



}
