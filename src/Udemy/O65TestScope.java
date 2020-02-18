package Udemy;

public class O65TestScope {
    public static void main(String[] args) {
        int var1=200; //local variable
        System.out.println (" "+var1);

        System.out.println (doCalc (var1));
    }

    static int doCalc(int var1){
         var1=var1*2;
         return var1;
    }
}
