package SubjectHeadings.Arrays.CommonArray;
import java.util.Arrays;


public class BinarySearchMeth {
    public static void main(String[] args)
    {
        int[] list= {1, 4, 5, 11, 15,22, 33,66,67,68,75};//Dizi'mizi oluşturuyoruz

        //Dizide bir elemanın indeksini bulmak için SubjectHeadings.Arrays.binarySearch() kullanırız
        //!!!!! SubjectHeadings.Arrays.binarySearch() kullanabilmemiz için dizimiz SIRALI olmalıdır. !!!!
        //Eğer sıralı değilse SubjectHeadings.Arrays.sort ile sıralayabilirsiniz
        int index = Arrays.binarySearch(list,5); //bulunduğu indeksi döner,aradığımız sayı dizide mevcut değilse negatif bir sayı döner
        System.out.println("5'in indeksi :"+index);

    }
}
