package Cours.Jun2526;

public class Fibonacci {
    public static void main(String[] args) {
        // surekli son iki sayinin toplanmasi

        int a=1;
        int b=1;
        int c=a+b;

        System.out.println(a);
        System.out.println(b);

        for (int i=0;i<10;i++){
            c=a+b;    // kaydirma islemi
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
