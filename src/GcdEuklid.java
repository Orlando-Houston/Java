public class GcdEuklid {
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Driver method
    public static void main(String[] args)
    {
        int a = 12, b = 8;
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}


