package Cours.classmethodexamplejul2021Jul;

public class LoansTeacher {
    public int calculateMortgage(int month,int monthlyPayment) {

        int result=monthlyPayment*(360-month);
        return result;


    }

    public double calculateCarInsurance(int carPrice,int month) {
        double insurance=(carPrice/month)*0.9-month;
        return insurance;

    }

}
