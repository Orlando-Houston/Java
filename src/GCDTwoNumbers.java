import java.util.Scanner;

import static com.sun.tools.doclint.Entity.and;

public class GCDTwoNumbers {
    public static void main(String[] args)
    {
        int m,n,gcd = 0;
        System.out.print("\nEnter two numbers : ");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        int i;
        for(i = 1; i <= m && i <= n; i++)
        {
            if((m % i == 0) && (n % i == 0))
            {
                gcd = i;
            }
        }
        System.out.println("\nGCD of " + m + "and "+ n + "is"  + gcd);
        System.out.println();
    }
}



