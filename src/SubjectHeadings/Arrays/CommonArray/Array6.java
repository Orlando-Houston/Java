package SubjectHeadings.Arrays.CommonArray;

/*Diyelim ki diziyi oluşturduk ama değer ataması yapmadık. Değer ataması yapmadan belli bir indekse ulaşmaya çalıştığımızda ne olur dersiniz?

Diziyi oluşturduğumuz an başlangıç değerleri zaten bulunmaktadır. Aşağıdaki listede bir dizinin oluşturulduğu an başlangıç değerlerini paylaşıyorum.

String -> null
int/short/byte/long -> 0
double/float -> 0.0
boolean -> false
char -> ‘\u0000’
Herhangi Bir Objeyi tutan referans -> null

 */

public class Array6 {
    public static void main(String[] args) {
        int[] myList= new int[8]; // 8 elemanlı dizi oluşturuldu
        System.out.println(myList[4]); //herhangi bir değer ataması yapılmadan 5. elemana ulaşmaya çalışıyoruz
    }

}
