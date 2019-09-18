package OoPs.Augh17PolimorismOverRid39Lesson;

public class Loan {
    double interestRate;
    protected int numberOfPayment;
    protected double amount;

    public Loan(double interestRate, int numberOfPayment, double amount) {
        this.interestRate = interestRate;
        this.numberOfPayment = numberOfPayment;
        this.amount = amount;
    }

    double calculateMonthlyPayment(){
        return this.amount*this.interestRate/this.numberOfPayment;
    }

    double calculateTotalPayment(){
        return this.amount*this.interestRate;
    }
    int getNumberOfPayment(){
        return this.numberOfPayment;
    }
}
