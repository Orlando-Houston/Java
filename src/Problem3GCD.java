public class Problem3GCD {
    public static void main(String[] args) {
        int a=12,  b=8, GCD=1,r=2;

        while(r<=a && r<=b){
            if (a%r==0 && b%r==0){
                GCD=r;
                r++;
            }
            System.out.println (GCD);
        }
    }

}
