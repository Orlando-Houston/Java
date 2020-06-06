package OoPs.Inheritance;

public class InheritenceExample1 {
    private static int additionPrivateStatic(int a, int b){
        return a+b;
    }
    {
        InheritenceExample1.additionPrivateStatic(4,7);
    }
    public static int additionPublicStatic(int a,int b){
        return a+b;
    }
    private int additionPrivate(int a,int b){
        return a+b;
    }
    {
        this.additionPrivate(8,7);
    }
    public int additionPublic(int a,int b){
        return a+b;
    }
}



 class InheritanceExample1Test {
    public static void main(String[] args) {
        InheritenceExample1.additionPublicStatic(2,5);
        InheritenceExample1 ex1 = new InheritenceExample1();
        ex1.additionPublic(3,8);

    }
}


