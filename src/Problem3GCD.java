public class Problem3GCD {
    public static void main(String[] args) {
        int a=12,  b=8, GCD=0;
        int remainder = 0;

        while(b!=0){
            remainder=a%b;
            a=b;
            b=remainder;
            //a=b;

        }
        System.out.println (remainder);
            System.out.println (b);
       System.out.println (a);
        }
    }


