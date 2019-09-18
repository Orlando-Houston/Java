package Cours.Aug3Saturday;

public class BankAccount {
    String name;
    double balance;
    int accountNumber;
    public BankAccount(String name,double balance,int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    public void displayBalance(){
        System.out.println(this.balance);
    }
    public void addMoney(){
        this.balance = this.balance +100;
    }
    public void addMoney(double amount){
        this.balance = this.balance+amount;
    }
    public void drawMoney(){
        this.balance = this.balance - 50;
    }
    public void drawMoney(double amountDraw){
        this.balance = this.balance - amountDraw;
    }
}

