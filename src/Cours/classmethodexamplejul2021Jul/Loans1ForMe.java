package Cours.classmethodexamplejul2021Jul;



public class Loans1ForMe {
    public static void main(String[] args) {
        int amountFinanced=15000;
        int downPayment=3000;
        int annualInterestRate=1;
        int minus=(amountFinanced-downPayment);
        int totalInterest=((minus*1/100*5));

         System.out.println("total interest:"+totalInterest);


         int timeFrame=60 ;
        int monthlyPayment=(minus+totalInterest)/timeFrame;
        System.out.println("MontlyPayment:"+monthlyPayment);

    }

}
