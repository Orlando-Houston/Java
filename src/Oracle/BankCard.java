package Oracle;

public class BankCard {
    void readCard(int cardNo){
        System.out.println ("Reading Card");
    }
    void checkCard(int cardNo){      //line n1
        System.out.println ("Checking Card");
    }

    public static void main(String[] args) {
        BankCard bankCard=new BankCard ();
        int cardNo=12344;
        bankCard.checkCard (cardNo);  //line n2
    }
}
