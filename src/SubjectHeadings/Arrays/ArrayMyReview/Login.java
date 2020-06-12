package SubjectHeadings.Arrays.ArrayMyReview;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String userName="user";
        String password = "password";
        Scanner scanner = new Scanner (System.in);
        System.out.print("User Name: ");
        String user = scanner.next();
        System.out.print("Password: ");
        String pass = scanner.next();

        if(user.equals(userName)&&password.equals(pass)){
            System.out.println("Welcome your page");
        }
        else {
            System.out.println("User Name or password is wrong");
        }
    }
}
