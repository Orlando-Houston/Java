package Cours.June30;

public class StringComparison {

    public static void main(String[] args) {
        String check1="ab;" ;
        String check2="abz";

        System.out.println(check1.compareTo(check2));
        if (check1.compareTo(check2)==0){
            System.out.println("They are equel");

        }

    }
}


