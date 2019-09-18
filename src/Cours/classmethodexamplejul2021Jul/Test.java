package Cours.classmethodexamplejul2021Jul;

public class Test {
    public static void main(String[] args) {

        Invoices invoice = new Invoices();
        String myElectric= invoice.evaluateElectric(1200);
        System.out.println(invoice.evaluateElectric(1200));
        String myInternet=invoice.evaluateInternetBill(50);
        System.out.println(invoice.evaluateInternetBill(50));


        LoansTeacher loan=new LoansTeacher();
        int mortgage=loan.calculateMortgage(15,1800);
       double carInsurance=loan.calculateCarInsurance(5000,72);


        Suggestions suggestions = new Suggestions();
        suggestions.suggestFood();
        suggestions.suggestCloths();


    }
}

