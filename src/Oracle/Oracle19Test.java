package Oracle;

public class Oracle19Test {
    void readCard(int cardNo){
        System.out.println ("Reading card");
    }
    void checkCard(int cardNo){
        System.out.println ("checking card");
    }

    public static void main(String[] args) {
        Oracle19Test ex=new Oracle19Test ();
        int cardNo=12344;
        ex.checkCard (cardNo);//line n2
        ex.readCard (cardNo);//line n3
    }
}
