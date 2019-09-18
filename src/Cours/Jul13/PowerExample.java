package Cours.Jul13;

public class PowerExample {
    public static void main(String[] args) {
        int number=3;
        int power=4;
        int result=1;
        for (int i=1;i<=power;i++){
            result=number*result;
        }
        System.out.println(result);
    }
}
