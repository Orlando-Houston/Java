package SubjectHeadings.Arrays.CommonArray;
import java.util.Arrays;



public class ArraysFillMethod {
    public static void main(String[] args)
    {
        int[] list = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
        //Diziyi Belirli Bir Değerle ile Doldurmak için SubjectHeadings.Arrays.fill()
        Arrays.fill(list,5);
        System.out.println(Arrays.toString(list));

        int[] liste2 = {1, 4, 99, 2, 5, -3, 6, 2,-49,52};//Dizi'mizi oluşturuyoruz
        //Diziyi Belirli Bir değerle, belirli bir aralıkta doldurma
        Arrays.fill(liste2,2,5,6);
        System.out.println(Arrays.toString(liste2));
    }
}

