package Recursion;

public class SummNumbersWithRecursion {
    public static void main(String[] args) {
        int number = 20;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }

    public static int addNumbers(int num) {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}
/*
Başlangıçta, işlevden argüman olarak geçirilen 20 ile addNumbers()çağrılır main().

numara(20) sonucuna eklendi addNumbers(19).

Sonraki işlev çağrısında addNumbers()için addNumbers(), 19 'nin sonucuna ilave olan geçirilir addNumbers(18). Bu süreçnum eşittir 0.

Ne zaman num0'a eşitse, özyinelemeli çağrı yoktur ve bu, tamsayıların toplamını main()işleve döndürür .
 */
