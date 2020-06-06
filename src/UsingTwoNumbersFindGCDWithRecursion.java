import java.util.Scanner;

public class UsingTwoNumbersFindGCDWithRecursion {
    static int gcd(int a, int b){

        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    }

    public static void main(String[] args)
    {
        int a,b,gcd = 0;
        System.out.print("\nEnter two numbers : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("\nGCD of " + a + "and"   + b +   "is" + gcd(a,b));
        System.out.println();
    }}

