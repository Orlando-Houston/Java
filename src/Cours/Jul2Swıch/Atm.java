package Cours.Jul2Swıch;


import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int balance =1000;
        int transaction;

        System.out.println("1:Balance View");
        System.out.println("2:Deposit");
        System.out.println("3:Withdraw");
        System.out.println("4:Log out");

        transaction=scan.nextInt();


        switch (transaction){
            case 1:

                System.out.println("Balance:"+" balance + ");
                break;
            case 2:

                System.out.println("How much many will you deposit?");
                int amount=scan.nextInt();
                balance += amount;
                System.out.println("Amount:"+ amount);
                break;
            case 3:

                System.out.println("How much many will you withdraw?");
                 amount =scan.nextInt();
                balance -=  amount;
                System.out.println("balance:"+amount);
                break;
            case 4:

                System.out.println("Log out");
                break;
                default:
                    System.out.println("Invalid Transaction");



        }
    }
}
