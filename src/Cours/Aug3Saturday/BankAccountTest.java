package Cours.Aug3Saturday;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Saving",909000.00,123456);
        myAccount.displayBalance();
        myAccount.drawMoney(45682);
        myAccount.displayBalance();
    }
}

