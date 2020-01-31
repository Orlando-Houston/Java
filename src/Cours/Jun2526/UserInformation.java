package Cours.Jun2526;

import java.util.Scanner;

public class UserInformation {

    public static void main(String[] args) {
        Scanner userInfo=new Scanner(System.in);
        System.out.print("Please enter write your name:");
        String userName=userInfo.next();
        System.out.println(userName);

        System.out.print("please enter your age:");
        int userAge=userInfo.nextInt();
        System.out.println(userAge);


        System.out.println("please enter your hair color");
        String userHairColor=userInfo.next();
        System.out.println(userHairColor);


    }
}
