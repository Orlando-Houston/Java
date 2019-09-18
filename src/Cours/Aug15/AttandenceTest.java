package Cours.Aug15;

public class AttandenceTest {
    public static void main(String[] args) {
        String[] myNameList = {"John","Alice","Mike","jenifer","David","Susan"};
        int[] myIDList = {1,2,3,4,5,6};
        Attandence myClass = new Attandence(myNameList,myIDList);
        myClass.enterAttandence("Monday");
        myClass.displayAttandence();
        System.exit(0);


    }
}

