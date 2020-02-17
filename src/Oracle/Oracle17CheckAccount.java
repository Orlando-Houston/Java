package Oracle;

public class Oracle17CheckAccount {
    public int amount;
    public Oracle17CheckAccount(int amount){
        this.amount=amount;

    }
    public int getAmount(){
        return amount;
    }
    public void changeAmount(int x){
        amount +=x;

}
    public static void main(String[] args) {
        Oracle17CheckAccount acc17=new Oracle17CheckAccount((int)(Math.random ()*1000));
        System.out.println (acc17.getAmount ());

    }
}
