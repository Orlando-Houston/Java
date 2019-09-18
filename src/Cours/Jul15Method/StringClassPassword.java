package Cours.Jul15Method;

public class StringClassPassword {
    public static void passwordCheck(String password) {
        if (password.length()>=6){
            System.out.println("Password is OK");
        }
        else{
            System.out.println("Password should be at least 6 character");
        }

    }

    public static void main(String[] args) {
        passwordCheck("abcdgt");


    }
}
