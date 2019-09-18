package Cours.classmethodexamplejul2021Jul;
import java.util.Scanner;

public class TestInvLoansSug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Invoices invoice = new Invoices();

        System.out.print("what is your electric consumption? ");
        int consumpt = scan.nextInt();

        String myElectric = invoice.evaluateElectric(consumpt);

        System.out.print("What is your internet speed? ");
        int speed = scan.nextInt();
        String myInternet = invoice.evaluateInternetBill(speed);

        LoansTeacher loan = new LoansTeacher();

        System.out.print("Your monthly payment?");
        int monthlyPay = scan.nextInt();
        System.out.print("Which payment as month? ");
        int month = scan.nextInt();
        int mortgage = loan.calculateMortgage(month ,monthlyPay);

        System.out.print("What is your car total price? ");
        int carPrice = scan.nextInt();
        System.out.print("What is your instalment quantity? ");
        int months = scan.nextInt();
        double carInsurance = loan.calculateCarInsurance(carPrice,months);

        System.out.println("Your electric is "+ myElectric);
        System.out.println("Your internet is "+myInternet);
        System.out.println("Your mortgage is "+mortgage);
        System.out.println("Your insurance is "+carInsurance);



        Suggestions suggestion = new Suggestions();
        suggestion.suggestFood();
        suggestion.suggestCloths();





    }
}

