package Oracle;

public class O17CheckingAccount {
    private int amount;  //non static variable global  instance

    public  O17CheckingAccount(int amount){
        this. amount=amount;

    }

    public int getAmount() {
        return amount;
    }
    public void changeAmount(int x){
        amount+=x;
    }
}

