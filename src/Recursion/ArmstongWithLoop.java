package Recursion;

public class ArmstongWithLoop {
    public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

/*
Programı çalıştırdığınızda, çıktı:

        371 bir Armstrong numarasıdır.
        İlk olarak, verilen sayı (numara) değeri başka bir tamsayı değişkeninde saklanır, originalNumber. Bunun nedeni, son sayı ile sondaki orijinal sayı değerlerini karşılaştırmamız gerektiğidir.
        Ardından, bir döngü döngüsü originalNumber 0'a eşit olana kadar.
        Her yinelemede, son basamağı num içinde depolandı geri kalan kısım.
        Sonra, geri kalan kısımMath.pow()işlevi kullanılarak 3 (basamak sayısı) tarafından güçlendirilir vesonuç.
        Ardından, son basamak originalNumber 10'a bölündükten sonra.
        En sonunda, sonuç ve numarakarşılaştırılır. Eşitse, bir ordu numarasıdır. Eğer değilse, değil.
        Örnek 2: Armstrong numarasını n basamak için kontrol edin
public class Armstrong {

    public static void main(String[] args) {

        int number = 1634, originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

 */

